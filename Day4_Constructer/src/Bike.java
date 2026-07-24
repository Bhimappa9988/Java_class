class Bike
{
    String brand;
    int price;
    String color;

    Bike(String brand, int price, String color)
    {
        this.brand = brand;
        this.price = price;
        this.color = color;
    }

    public static void main(String[] args)
    {
        Bike b1 = new Bike("Yamaha", 160000, "Black");
        Bike b2 = new Bike("Honda", 120000, "Red");

        System.out.println(b1.brand + " " + b1.price + " " + b1.color);
        System.out.println(b2.brand + " " + b2.price + " " + b2.color);
    }
}