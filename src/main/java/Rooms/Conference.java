package Rooms;

public class Conference extends Room {
    private String name;

    public Conference(String name, int capacity, double price) {
        this.name = name;
        this.price = price;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
