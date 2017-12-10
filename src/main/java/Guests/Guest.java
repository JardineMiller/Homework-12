package Guests;

import Rooms.Room;

public class Guest {
    private String name;
    private double wallet;

    public Guest(String name, double wallet) {
        this.name = name;
        this.wallet = wallet;
    }

    public boolean hasFunds(Room room) {
        return wallet >= room.getPrice();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWallet() {
        return wallet;
    }

    public void adjustWallet(double amount) {
        this.wallet += amount;
    }

    public void purchaseRoom(Room room) {
        if (hasFunds(room)) {
            adjustWallet(room.getPrice());
        }
    }
}
