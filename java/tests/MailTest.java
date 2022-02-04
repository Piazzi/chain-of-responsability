import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MailTest {

    PostOfficeAirMail airMail;
    PostOfficeMailTruck truck;
    PostOfficeDeliveryMan deliveryMan;

    @BeforeEach
    public void setUp() {
        airMail = new PostOfficeAirMail(null);
        truck = new PostOfficeMailTruck(airMail);
        deliveryMan = new PostOfficeDeliveryMan(truck);
    }

    @Test
    public void AirMailShouldDeliver() {
        assertEquals("Air Mail", deliveryMan.deliver(new Mail(MailTypeParcel.getParcel())));
    }

    @Test
    public void MailTruckShouldDeliver() {
        assertEquals("Delivery Truck", deliveryMan.deliver(new Mail(MailTypePackage.getMailTypePackage())));
    }

    @Test
    public void DeliveryManShouldDeliver() {
        assertEquals("Delivery Man", deliveryMan.deliver(new Mail(MailTypeLetter.getLetter())));
    }

}