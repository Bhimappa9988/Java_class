class Mobile
{
    String company;
    String model;
    int price;
    int ram;

    Mobile(String company, String model, int price, int ram)
    {
        this.company = company;
        this.model = model;
        this.price = price;
        this.ram = ram;
    }

    public static void main(String[] args)
    {
        Mobile m1 = new Mobile("Samsung", "A55", 40000, 8);
        Mobile m2 = new Mobile("OnePlus", "Nord", 30000, 12);

        System.out.println(m1.company + " " + m1.model + " " + m1.price + " " + m1.ram);
        System.out.println(m2.company + " " + m2.model + " " + m2.price + " " + m2.ram);
    }
}