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

    public Boolean uppercase(){
        String pattern = "^(?=.*[A-Z]).{8,}$";
        return password.matches(pattern);
    }

    public Boolean lowercase(){
        String pattern = "^(?=.*[a-z]).{8,}$";
        return password.matches(pattern);
    }

    public Boolean number(){
        String pattern = "^(?=.*[0-9]).{8,}$";
        return password.matches(pattern);
    }

    public Boolean specialChar(){
        String pattern = "^(?=.*[@#$%^&+=]).{8,}$";
        return password.matches(pattern);
    }


    public Boolean whitespace(){
        String pattern = "^(?=\\S+$).{8,}$";
        return password.matches(pattern);
    }

    public Boolean identicalChars(){
        String pattern = ".*([a-z\\d])\\1\\1.*";
        return !password.matches(pattern);
    }

    public Boolean length(){
        return password.length() >= 8;
    }
}
