class Bike
{
    String brand;
    static String showroom = "Bangalore Bikes";

    Bike(String brand)
    {
        this.brand = brand;
    }

    public static void main(String[] args)
    {
        Bike b1 = new Bike("Yamaha");
        Bike b2 = new Bike("Honda");
        Bike b3 = new Bike("KTM");

        System.out.println(b1.brand + " " + Bike.showroom);
        System.out.println(b2.brand + " " + Bike.showroom);
        System.out.println(b3.brand + " " + Bike.showroom);
    }
}