package ss19_string_regex.bai_tap.bai_1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassName {
    private  static final String NAME_REGEX = "^[C,A,P][0-9]{4}[GHIKLM]$";

    public ClassName() {
    }

    public  boolean validate(String regex){
        Pattern pattern = Pattern.compile(NAME_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
