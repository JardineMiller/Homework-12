import Guests.Guest;
import Rooms.Conference;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ConferenceTest {
    private Conference conference;
    private Guest guest;

    @Before
    public void before() {
        conference =  new Conference("The Lincoln Room", 30, 1500.00);
        guest = new Guest("Julia", 1500.00);
    }

    @Test
    public void hasName() {
        assertEquals("The Lincoln Room", conference.getName());
    }

    @Test
    public void canSetName() {
        assertEquals("The Lincoln Room", conference.getName());
        conference.setName("The Washington Room");
        assertEquals("The Washington Room", conference.getName());
    }

    @Test
    public void canCountGuests() {
        assertEquals(0, conference.countGuests());
    }

    @Test
    public void canHaveGuests() {
        assertNotNull(conference.getGuests());
    }

    @Test
    public void isFull() {
        assertEquals(false, conference.isFull());
    }

    @Test
    public void canGetRoomCapacity() {
        assertEquals(30, conference.getCapacity());
    }

    @Test public void canSetRoomCapacity() {
        assertEquals(30, conference.getCapacity());
        conference.setCapacity(40);
        assertEquals(40, conference.getCapacity());
    }

    @Test
    public void canGetRoomPrice() {
        assertEquals(1500.00, conference.getPrice(), 0.01);
    }

    @Test
    public void canSetRoomPrice() {
        assertEquals(1500.00, conference.getPrice(), 0.01);
        conference.setPrice(1100.00);
        assertEquals(1100.00, conference.getPrice(), 0.01);
    }

    @Test
    public void canAddGuest() {
        conference.addGuest(guest);
        assertEquals(1, conference.countGuests());
    }

    @Test
    public void canRemoveGuest() {
        conference.addGuest(guest);
        assertEquals(1, conference.countGuests());
        conference.removeGuest(guest);
        assertEquals(0, conference.countGuests());
    }


}
