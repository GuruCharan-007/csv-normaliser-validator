package app;

public class Normalizer {

    public String normalize(String value) {
        if (value == null || value.trim().isEmpty()) {
            return "missing";
        }
        return value.trim().toLowerCase();
    }
}
