public class Mail {

    private MailType mailType;
    private float distance;
    private String sender;
    private String  deliveryAddress;
    public float weight;

    public Mail(MailType mailType) {
        this.mailType = mailType;
    }
    
    public MailType getMailType() {
        return mailType;
    }

    public void setMailType(MailType mailType) {
        this.mailType = mailType;
    }
    
}
