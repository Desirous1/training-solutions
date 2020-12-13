package week03d04;

public class PhoneParser {

    public Phone parsePhone(String para) {
        // 20-1234567
        String prefix = para.substring(0,2); // para.substring(0, para.indexOf("-")
        String number = para.substring(3); // para.substring(para.indexOf("-" - 1)
        Phone phone = new Phone(prefix, number);
        return phone;
    }

    public static void main(String[] args) {
        PhoneParser parser = new PhoneParser();
        Phone phone = parser.parsePhone("12-4988374");
        System.out.println(phone.getPrefix());
        System.out.println(phone.getNumber());
        System.out.println(phone);

    }

}
