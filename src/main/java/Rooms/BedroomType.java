package Rooms;

public enum BedroomType {
    SINGLE("Single", 1, 50.00),
    DOUBLE("Double", 2, 100.00),
    FAMILY("Family", 4, 250.00),
    EXECUTIVE("Executive", 2, 400.00),
    DELUXE("Deluxe", 2, 1000.00);

    private int capacity;
    private double price;
    private final String type;

    BedroomType(String type, int capacity, double price) {
        this.type = type;
        this.capacity = capacity;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public int getCapacity() {
        return capacity;
    }
}
