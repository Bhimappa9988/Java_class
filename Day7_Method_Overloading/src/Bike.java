class Bike
{
    String brand = "Yamaha";

    void info()
    {
        System.out.println("Bike");
    }

    void info(String color)
    {
        System.out.println(color);
    }

    void info(int price)
    {
        System.out.println(price);
    }

    void info(String color, int price)
    {
        System.out.println(color + " " + price);
    }

    void info(double mileage)
    {
        System.out.println(mileage);
    }

    public static void main(String[] args)
    {
        Bike b1 = new Bike();

        System.out.println(b1.brand);

        b1.info();
        b1.info("Black");
        b1.info(180000);
        b1.info("Red",200000);
        b1.info(45.5);
    }
}