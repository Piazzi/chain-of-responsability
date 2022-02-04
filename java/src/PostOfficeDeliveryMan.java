public class PostOfficeDeliveryMan extends PostOffice {
    
    public PostOfficeDeliveryMan(PostOffice superior) {
        mailList.add(MailTypeLetter.getLetter());
        setDelivery(superior);
    }
    
    public String getDeliveryInfo() {
        return "Delivery Man";
    }
}
