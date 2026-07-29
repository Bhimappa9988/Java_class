class Vehicle
{
    int speed = 120;

    void start()
    {
        System.out.println("Vehicle Started");
    }

    void stop()
    {
        System.out.println("Vehicle Stopped");
    }
}

public class Car extends Vehicle
{
    public static void main(String[] args)
    {
        Car c1 = new Car();

        System.out.println(c1.speed);
        c1.start();
        c1.stop();
    }
}