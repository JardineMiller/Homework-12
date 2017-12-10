package Rooms;

public class Bedroom extends Room {
    private int roomNumber;
    private BedroomType roomType;

    public Bedroom(int roomNumber, BedroomType roomType) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.capacity = roomType.getCapacity();
        this.price = roomType.getPrice();
    }

    public int getRoomNumber() {
        return this.roomNumber;
    }

    public String getRoomType() {
        return this.roomType.getType();
    }

    public void setRoomType (BedroomType roomType) {
        this.roomType = roomType;
        this.price = roomType.getPrice();
        this.capacity = roomType.getCapacity();
    }
}
