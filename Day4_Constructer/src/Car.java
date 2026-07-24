class Car
{
    String brand;
    String color;
    int price;
    int seats;

    Car(String brand, String color, int price, int seats)
    {
        this.brand = brand;
        this.color = color;
        this.price = price;
        this.seats = seats;
    }

    public static void main(String[] args)
    {
        Car c1 = new Car("Toyota", "White", 1200000, 5);
        Car c2 = new Car("Hyundai", "Blue", 900000, 5);

        System.out.println(c1.brand + " " + c1.color + " " + c1.price + " " + c1.seats);
        System.out.println(c2.brand + " " + c2.color + " " + c2.price + " " + c2.seats);
    }
}