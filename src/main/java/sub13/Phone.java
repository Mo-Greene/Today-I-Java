package sub13;

public class Phone {
    String model;
    String color;
    int price;

    public Phone(String model, String color) {
        this.model = model;
        this.color = color;
    }

    public Phone() {
    }

    public Phone(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }
}