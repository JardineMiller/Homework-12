import Guests.Guest;
import Rooms.Bedroom;
import Rooms.Room;

import java.util.ArrayList;

public class Hotel {
    private ArrayList<Room> rooms;
    double till;
    private ArrayList<Bedroom> vacantBedrooms;


    public Hotel(double till) {
        this.till = till;
        this.rooms = new ArrayList<>();
        this.vacantBedrooms = new ArrayList<>();
    }

    public ArrayList<Room> getRooms() {
        return this.rooms;
    }

    public void addRoom(Room room) {
        this.rooms.add(room);
    }

    public int roomCount() {
        return this.rooms.size();
    }

    public void checkInGuest(Guest guest, Room room) {
        if(!room.isFull()) {
            guest.purchaseRoom(room);
            room.addGuest(guest);
        }
    }

    public void checkOutGuest(Guest guest, Room room) {
        room.removeGuest(guest);
    }

    public ArrayList<Bedroom> getVacantBedrooms() {
        vacantBedrooms.clear();
        for(Room room : rooms) {
            if(room instanceof Bedroom && room.isEmpty()) {
                vacantBedrooms.add((Bedroom)room);
            }
        }
        return vacantBedrooms;
    }
}
