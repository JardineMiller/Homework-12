import Guests.Guest;
import Rooms.Bedroom;
import Rooms.BedroomType;
import Rooms.Conference;
import Rooms.Dining;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {
    Hotel hotel;
    Bedroom bedroom1;
    Bedroom bedroom2;
    Bedroom bedroom3;
    Bedroom bedroom4;
    Bedroom bedroom5;
    Dining diningRoom;
    Conference conference1;
    Conference conference2;
    Conference conference3;
    Guest guest1;
    Guest guest2;

    @Before
    public void before() {
        hotel = new Hotel(0.00);
        bedroom1 = new Bedroom(1, BedroomType.SINGLE);
        bedroom2 = new Bedroom(2, BedroomType.DOUBLE);
        bedroom3 = new Bedroom(3, BedroomType.FAMILY);
        bedroom4 = new Bedroom(4, BedroomType.EXECUTIVE);
        bedroom5 = new Bedroom(5, BedroomType.DELUXE);
        diningRoom = new Dining(50);
        conference1 = new Conference("The Lincoln Suite", 30, 2000.00);
        conference2 = new Conference("The Washington Room", 200, 5000.00);
        conference3 = new Conference("Meeting Room", 15, 250.00);
        hotel.addRoom(bedroom1);
        hotel.addRoom(bedroom2);
        hotel.addRoom(bedroom3);
        hotel.addRoom(bedroom4);
        hotel.addRoom(bedroom5);
        hotel.addRoom(diningRoom);
        hotel.addRoom(conference1);
        hotel.addRoom(conference2);
        hotel.addRoom(conference3);
        guest1 = new Guest("Jardine", 500.00);
        guest2 = new Guest("Julia", 2500.00);
    }

    @Test
    public void canAddRoom() {
        assertEquals(9, hotel.roomCount());
    }

    @Test
    public void canAddGuestToRoom() {
        hotel.checkInGuest(guest1, bedroom2);
        hotel.checkInGuest(guest2, bedroom2);
        assertEquals(2, bedroom2.countGuests());
        assertEquals(true, bedroom2.isFull());
        bedroom2.printGuests();
    }

    @Test
    public void canRemoveGuest() {
        hotel.checkInGuest(guest1, bedroom2);
        hotel.checkInGuest(guest2, bedroom2);
        assertEquals(2, bedroom2.countGuests());
        assertEquals(true, bedroom2.isFull());
        hotel.checkOutGuest(guest2, bedroom2);
        assertEquals(1, bedroom2.countGuests());
        assertEquals(false, bedroom2.isFull());
    }

    @Test
    public void canPrintRooms() {
//        System.out.println(hotel.getRooms());
    }

    @Test
    public void testVacantBedroomsAllEmpty() {
        assertEquals(5, hotel.getVacantBedrooms().size());
    }

    @Test
    public void testVacantBedroomsOneNotEmpty() {
        assertEquals(5, hotel.getVacantBedrooms().size());
        hotel.checkInGuest(guest1, bedroom2);
        hotel.checkInGuest(guest2, bedroom1);
        assertEquals(3, hotel.getVacantBedrooms().size());
        System.out.println(hotel.getVacantBedrooms());
    }


}
