class Mobile
{
    String model = "Galaxy A55";
    int price = 40000;
    static String brand = "Samsung";

    void model()
    {
        System.out.println(model);
    }

    void price()
    {
        System.out.println(price);
    }

    void brand()
    {
        System.out.println(brand);
    }

    void details()
    {
        System.out.println(model + " " + price);
    }

    void allDetails()
    {
        System.out.println(model + " " + price + " " + brand);
    }

    public static void main(String[] args)
    {
        Mobile m1 = new Mobile();
        Mobile m2 = new Mobile();

        m1.model();
        m1.price();
        m2.brand();
        m2.details();
        m2.allDetails();
    }
}