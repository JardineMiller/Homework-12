import Guests.Guest;
import Rooms.Bedroom;
import Rooms.BedroomType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class BedroomTest {
    private Bedroom bedroom;
    private Guest guest;

    @Before
    public void before() {
        bedroom = new Bedroom(1, BedroomType.DELUXE);
        guest = new Guest("Jardine", 1500.00);
    }

    @Test
    public void canCountGuests() {
        assertEquals(0, bedroom.countGuests());
    }

    @Test
    public void canHaveGuests() {
        assertNotNull(bedroom.getGuests());
    }

    @Test
    public void isFull() {
        assertEquals(false, bedroom.isFull());
    }

    @Test
    public void canGetRoomNumber() {
        assertEquals(1, bedroom.getRoomNumber());
    }

    @Test
    public void canGetRoomType() {
        assertEquals("Deluxe", bedroom.getRoomType());
    }

    @Test
    public void canSetRoomType() {
        assertEquals("Deluxe", bedroom.getRoomType());
        bedroom.setRoomType(BedroomType.FAMILY);
        assertEquals("Family", bedroom.getRoomType());
        assertEquals(4, bedroom.getCapacity());
        assertEquals(250.00, bedroom.getPrice(), 0.01);
    }

    @Test
    public void canGetRoomCapacity() {
        assertEquals(2, bedroom.getCapacity());
    }

    @Test public void canSetRoomCapacity() {
        assertEquals(2, bedroom.getCapacity());
        bedroom.setCapacity(4);
        assertEquals(4, bedroom.getCapacity());
    }

    @Test
    public void canGetRoomPrice() {
        assertEquals(1000.00, bedroom.getPrice(), 0.01);
    }

    @Test
    public void canSetRoomPrice() {
        assertEquals(1000.00, bedroom.getPrice(), 0.01);
        bedroom.setPrice(1100.00);
        assertEquals(1100.00, bedroom.getPrice(), 0.01);
    }

    @Test
    public void canAddGuest() {
        bedroom.addGuest(guest);
        assertEquals(1, bedroom.countGuests());
    }

    @Test
    public void canRemoveGuest() {
        bedroom.addGuest(guest);
        assertEquals(1, bedroom.countGuests());
        bedroom.removeGuest(guest);
        assertEquals(0, bedroom.countGuests());
    }


}
