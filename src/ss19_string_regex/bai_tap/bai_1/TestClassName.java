package ss19_string_regex.bai_tap.bai_1;

public class TestClassName {

    private static ClassName className;

    public static final String[] validNameclass= new String[]{": M0318G"};

    public static void main(String[] args) {
        className = new ClassName();
        for (String nameClass: validNameclass ) {
            boolean isValid = className.validate(nameClass);
            System.out.println("Class is" + nameClass +" "+ "is valid"+" "+ isValid );
        }
    }
}
