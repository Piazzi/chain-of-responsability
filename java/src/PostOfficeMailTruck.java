public class PostOfficeMailTruck extends PostOffice {

    public PostOfficeMailTruck(PostOffice superior) {
        mailList.add(MailTypePackage.getMailTypePackage());
        setDelivery(superior);
    }
    
    public String getDeliveryInfo() {
        return "Delivery Truck";
    }

}
