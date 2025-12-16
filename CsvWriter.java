package app;

import java.nio.file.*;
import java.util.*;

public class CsvWriter {

    public void writeFiles(
            List<String[]> rows,
            String cleanFile,
            String rejectFile,
            Normalizer normalizer,
            Validator validator
    ) throws Exception {

        List<String> clean = new ArrayList<>();
        List<String> rejects = new ArrayList<>();

        for (String[] row : rows) {

            for (int i = 0; i < row.length; i++) {
                row[i] = normalizer.normalize(row[i]);
            }

            String reason = validator.validate(row);

            if (reason == null) {
                clean.add(String.join(",", row));
            } else {
                rejects.add(String.join(",", row) + "," + reason);
            }
        }

        Files.write(Paths.get(cleanFile), clean);
        Files.write(Paths.get(rejectFile), rejects);
    }
}
