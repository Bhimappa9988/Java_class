class Car
{
    String brand;
    String color;
    int price;

    Car(String brand,String color,int price)
    {
        this.brand=brand;
        this.color=color;
        this.price=price;
        System.out.println(brand+" "+color+" "+price);
    }

    Car(String brand,String color)
    {
        this.brand=brand;
        this.color=color;
        System.out.println(brand+" "+color);
    }

    Car(String brand)
    {
        this.brand=brand;
        System.out.println(brand);
    }

    public static void main(String args[])
    {
        Car c1=new Car("Toyota","White",1500000);
        Car c2=new Car("Honda","Black");
        Car c3=new Car("Hyundai");
    }
}