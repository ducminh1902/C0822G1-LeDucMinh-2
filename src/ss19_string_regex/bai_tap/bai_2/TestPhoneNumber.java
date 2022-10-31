package ss19_string_regex.bai_tap.bai_2;

public class TestPhoneNumber {
    private static  PhoneNumber phoneNumber;

    public static  final String[] validNumber = new String[] {"840978489648"};

    public static void main(String[] args) {
        phoneNumber = new PhoneNumber();
        for (String number: validNumber) {
            boolean isvalid = phoneNumber.validate(number);
            System.out.println("Phone Number :"+ number + " is valid :"+ isvalid);
        }
    }
}
