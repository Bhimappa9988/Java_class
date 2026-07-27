class Car
{
    String model;
    static String company = "Toyota";

    Car(String model)
    {
        this.model = model;
    }

    public static void main(String[] args)
    {
        Car c1 = new Car("Fortuner");
        Car c2 = new Car("Land Cruiser");
        Car c3 = new Car("Innova");

        System.out.println(c1.model);
        System.out.println(c2.model);
        System.out.println(c3.model);
        System.out.println(Car.company);
    }
}