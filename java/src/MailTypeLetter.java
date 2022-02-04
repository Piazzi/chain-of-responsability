public class MailTypeLetter implements MailType {

    private static MailTypeLetter letter = new MailTypeLetter();

    private MailTypeLetter() {};
    
    public static MailTypeLetter getLetter() {
        return letter;
    }
}
