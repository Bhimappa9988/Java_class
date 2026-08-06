enum OperatingSystem
{
    Windows, Linux, MacOS
}

class Laptop
{
    String brand;
    OperatingSystem os;

    public static void main(String[] args)
    {
        Laptop l1 = new Laptop();
        Laptop l2 = new Laptop();
        Laptop l3 = new Laptop();

        l1.brand = "Dell";
        l1.os = OperatingSystem.Windows;

        l2.brand = "Apple";
        l2.os = OperatingSystem.MacOS;

        l3.brand = "Lenovo";
        l3.os = OperatingSystem.Linux;

        System.out.println(l1.brand + " " + l1.os);
        System.out.println(l2.brand + " " + l2.os);
        System.out.println(l3.brand + " " + l3.os);
    }
}