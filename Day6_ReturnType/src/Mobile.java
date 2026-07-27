class Mobile
{
    double getPrice()
    {
        return 25999.50;
    }

    public static void main(String[] args)
    {
        Mobile m1 = new Mobile();

        double price = m1.getPrice();

        System.out.println(price);
    }
}
