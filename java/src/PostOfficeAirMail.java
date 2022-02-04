public class PostOfficeAirMail extends PostOffice {

    public PostOfficeAirMail(PostOffice superior) {
        mailList.add(MailTypeParcel.getParcel());
        setDelivery(superior);
    }
    
    public String getDeliveryInfo() {
        return "Air Mail";
    }

}
