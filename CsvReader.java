package app;

import java.nio.file.*;
import java.util.*;

public class CsvReader {

    public List<String[]> read(String file) throws Exception {
        List<String> lines = Files.readAllLines(Paths.get(file));
        List<String[]> rows = new ArrayList<>();

        for (String line : lines) {
            String[] parts = line.split(",", -1);
            rows.add(parts);
        }
        return rows;
    }
}
