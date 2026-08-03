class Taxi
{
    void bookRide(int distance)
    {
        System.out.println("Ride Booked for " + distance + " km");
    }
}

class Cab extends Taxi
{
    @Override
    void bookRide(int distance)
    {
        System.out.println("Cab Ride Booked for " + distance + " km");
    }

    public static void main(String[] args)
    {
        Cab c1 = new Cab();
        Taxi t1 = new Taxi();

        c1.bookRide(15);
        t1.bookRide(10);
    }
}