class Mobile
{
    String model;
    static String brand = "Samsung";

    Mobile(String model)
    {
        this.model = model;
    }

    public static void main(String[] args)
    {
        Mobile m1 = new Mobile("A35");
        Mobile m2 = new Mobile("S24");
        Mobile m3 = new Mobile("M35");
        Mobile m4 = new Mobile("F15");

        System.out.println(m1.model + " " + Mobile.brand);
        System.out.println(m2.model + " " + Mobile.brand);
        System.out.println(m3.model + " " + Mobile.brand);
        System.out.println(m4.model + " " + Mobile.brand);
    }
}