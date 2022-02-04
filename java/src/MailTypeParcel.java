public class MailTypeParcel implements MailType {

    private static MailTypeParcel parcel = new MailTypeParcel();

    private MailTypeParcel() {};
    
    public static MailTypeParcel getParcel() {
        return parcel;
    }

}
