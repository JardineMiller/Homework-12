package Rooms;

import Guests.Guest;
import java.util.ArrayList;

public class Room {
    protected ArrayList<Guest> guests;
    protected int capacity;
    protected double price;

    public Room() {
        this.guests = new ArrayList<>();
    }

    public int getCapacity() {
        return capacity;
    }

    public double getPrice() {
        return price;
    }

    public ArrayList<Guest> getGuests() {
        return guests;
    }

    public void printGuests() {
        for(Guest guest : getGuests()) {
            System.out.println(guest.getName());
        }
    }

    public void setCapacity(int number) {
        this.capacity = number;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int countGuests() {
        return this.guests.size();
    }

    public boolean isFull() {
        return countGuests() >= capacity;
    }

    public boolean isEmpty() {
        return countGuests() == 0;
    }

    public void addGuest(Guest guest) {
        this.guests.add(guest);
    }

    public Guest removeGuest(Guest guest) {
        int removed = this.guests.indexOf(guest);
        return this.guests.remove(removed);
    }
}
