package task1;

import java.util.regex.Pattern;

public class Validator {
    private final String regexp = "^(?:25[0-5]|2[0-4]\\d|[0-1]?\\d{1,2})(?:\\.(?:25[0-5]|2[0-4]\\d|[0-1]?\\d{1,2})){3}$";
    private final Pattern pattern = Pattern.compile(regexp);

    public boolean validate(String address) {
        return pattern.matcher(address).matches();
    }
}
