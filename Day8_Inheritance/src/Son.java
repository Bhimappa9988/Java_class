class Father 
{
    int money = 10000;

    void useCar()
    {
        System.out.println("Use Car");
    }

    void useBike()
    {
        System.out.println("Use Bike");
    }
}

public class Son extends Father
{

    public static void main(String[] args)
    {

        Son s1 = new Son();

        System.out.println(s1.money);
        s1.useCar();
        s1.useBike();
    }
}