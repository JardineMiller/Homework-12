import Guests.Guest;
import Rooms.Bedroom;
import Rooms.BedroomType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class GuestTest {
    private Guest guest;
    private Bedroom room;

    @Before
    public void before() {
        guest = new Guest("Jardine", 2750.00);
        room = new Bedroom(2, BedroomType.DOUBLE);
    }

    @Test
    public void hasName() {
        assertEquals("Jardine", guest.getName());
    }

    @Test public void canSetName() {
        guest.setName("Mr. Jardine");
        assertEquals("Mr. Jardine", guest.getName());
    }

    @Test public void hasWallet() {
        assertEquals(2750.00, guest.getWallet(), 0.01);
    }

    @Test public void canSetWallet() {
        guest.adjustWallet(-50);
        assertEquals(2700.00, guest.getWallet(), 0.01);
    }

    @Test public void testHasFuns() {
        assertEquals(true, guest.hasFunds(room));
    }
}
