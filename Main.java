package app;

import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter input CSV file: ");
        String inputFile = sc.nextLine();

        System.out.print("Enter clean output file: ");
        String cleanFile = sc.nextLine();

        System.out.print("Enter rejects output file: ");
        String rejectFile = sc.nextLine();

        CsvReader reader = new CsvReader();
        List<String[]> rows = reader.read(inputFile);

        Normalizer normalizer = new Normalizer();
        Validator validator = new Validator();
        CsvWriter writer = new CsvWriter();

        writer.writeFiles(rows, cleanFile, rejectFile, normalizer, validator);

        System.out.println("Processing complete.");

        sc.close();
    }
}
