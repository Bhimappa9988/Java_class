class Laptop {

    String brand;
    int ram;
    int storage;
    int price;

    public static void main(String[] args) {

        Laptop l1 = new Laptop();
        Laptop l2 = new Laptop();
        Laptop l3 = new Laptop();
        Laptop l4 = new Laptop();
        Laptop l5 = new Laptop();

        l1.brand = "Dell";
        l1.ram = 8;
        l1.storage = 512;
        l1.price = 55000;

        l2.brand = "HP";
        l2.ram = 16;
        l2.storage = 512;
        l2.price = 70000;

        l3.brand = "Lenovo";
        l3.ram = 8;
        l3.storage = 256;
        l3.price = 50000;

        l4.brand = "Asus";
        l4.ram = 16;
        l4.storage = 1024;
        l4.price = 85000;

        l5.brand = "Acer";
        l5.ram = 8;
        l5.storage = 512;
        l5.price = 48000;

        System.out.println(l1.brand);
        System.out.println(l1.ram);
        System.out.println(l1.storage);
        System.out.println(l1.price);

        System.out.println(l2.brand);
        System.out.println(l2.ram);
        System.out.println(l2.storage);
        System.out.println(l2.price);

        System.out.println(l3.brand);
        System.out.println(l3.ram);
        System.out.println(l3.storage);
        System.out.println(l3.price);

        System.out.println(l4.brand);
        System.out.println(l4.ram);
        System.out.println(l4.storage);
        System.out.println(l4.price);

        System.out.println(l5.brand);
        System.out.println(l5.ram);
        System.out.println(l5.storage);
        System.out.println(l5.price);
    }
}