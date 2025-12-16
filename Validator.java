package app;

public class Validator {

    public String validate(String[] row) {

        if (row[0].isEmpty()) 
        {
            return "First column is required";
        }

        if (!row[1].isEmpty()) {
            try {
                Integer.parseInt(row[1]);
            } catch (NumberFormatException e) {
                return "Second column must be a number";
            }
        }

        return null; 
    }
}
