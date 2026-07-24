class Laptop
{
    String brand;

    Laptop(String brand)
    {
        this.brand = brand;
    }

    public static void main(String[] args)
    {
        Laptop l1 = new Laptop("Dell");
        Laptop l2 = new Laptop("HP");

        System.out.println(l1.brand);
        System.out.println(l2.brand);
    }
}