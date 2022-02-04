import java.util.ArrayList;

public abstract class PostOffice {

    protected ArrayList mailList = new ArrayList();
    private PostOffice deliveryType;

    public PostOffice getDeliveryType() {
        return deliveryType;
    }

    public void setDelivery(PostOffice postOfficeSuperior) {
        this.deliveryType = postOfficeSuperior;
    }
    
    public abstract String getDeliveryInfo();
    
    public String deliver(Mail mail) {
        if (mailList.contains(mail.getMailType())) {
            return getDeliveryInfo();
        }
        else {
            if (deliveryType != null && mail.weight < 10000) {
                return deliveryType.deliver(mail);
            }
            else
            {
                return "Mail can't be delivered";
            }
        }        
    }
}
