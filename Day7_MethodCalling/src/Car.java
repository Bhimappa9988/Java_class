class Car
{
    String model = "Fortuner";
    static String company = "Toyota";

    void modelName()
    {
        System.out.println(model);
    }

    void companyName()
    {
        System.out.println(company);
    }

    public static void main(String[] args)
    {
        Car c1 = new Car();
        Car c2 = new Car();
        Car c3 = new Car();

        c1.modelName();
        c2.companyName();
        c3.modelName();
    }
}