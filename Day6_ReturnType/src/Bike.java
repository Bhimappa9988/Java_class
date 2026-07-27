class Bike
{
    String brand;

    void setBrand(String brand)
    {
        this.brand = brand;
    }

    String getBrand()
    {
        return this.brand;
    }

    public static void main(String[] args)
    {
        Bike b1 = new Bike();
        Bike b2 = new Bike();

        b1.setBrand("Yamaha");
        b2.setBrand("Honda");

        System.out.println(b1.getBrand());
        System.out.println(b2.getBrand());
    }
}