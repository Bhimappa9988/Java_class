class Bike
{
    String brand = "Yamaha";
    int price = 180000;
    static String color = "Black";

    void showBrand()
    {
        System.out.println(brand);
    }

    void showPrice()
    {
        System.out.println(price);
    }

    void showColor()
    {
        System.out.println(color);
    }

    void bikeInfo()
    {
        System.out.println(brand + " " + price + " " + color);
    }

    public static void main(String[] args)
    {
        Bike b1 = new Bike();

        b1.showBrand();
        b1.showPrice();
        b1.showColor();
        b1.bikeInfo();
    }
}