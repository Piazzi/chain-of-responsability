public class MailTypePackage implements MailType {

    private static MailTypePackage mailTypePackage = new MailTypePackage();

    private MailTypePackage() {};

    public static MailTypePackage getMailTypePackage() {
        return mailTypePackage;
    }
}
