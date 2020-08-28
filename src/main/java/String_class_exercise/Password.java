package String_class_exercise;

import lombok.Data;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Data
public class Password {
    private String password;
    Pattern pattern;
    Matcher matcher;

    public Password(String password) {
        this.password = password;
    }

    public boolean uppercase(){
        pattern = Pattern.compile("^(?=.*[A-Z])$");
        matcher = pattern.matcher(password);

        return matcher.matches();
    }

    public boolean lowercase(){
        String pattern = "^(?=.*[a-z])$";
        return password.matches(pattern);
    }

    public boolean number(){
        String pattern = "(?=.*[0-9])";
        return password.matches(pattern);
    }

    public boolean specialChar(){
        String pattern = "(?=.*[@#$%^&+=])";
        return password.matches(pattern);
    }

    public boolean length(){
        return password.length() >= 8;
    }

    public boolean whitespace(){
        String pattern = "(?=\\S+$)";
        return password.matches(pattern);
    }

    public boolean identicalChars(){
        String pattern = "(?i)(?:([a-z0-9])\\\\1{2,})*";
        return password.matches(pattern);
    }
}
