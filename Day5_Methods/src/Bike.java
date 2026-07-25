class Bike
{
    void bikeName()
    {
        System.out.println("R15");
    }

    void price()
    {
        System.out.println(180000);
    }

    void add(int a, int b)
    {
        System.out.println(a + b);
    }

    void mod(int a, int b)
    {
        System.out.println(a % b);
    }

    public static void main(String[] args)
    {
        Bike b1 = new Bike();
        Bike b2 = new Bike();
        Bike b3 = new Bike();

        b1.bikeName();
        b2.price();
        b3.add(10, 20);
        b3.mod(25, 6);
    }
}