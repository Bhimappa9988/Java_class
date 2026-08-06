enum BusType
{
    Ordinary, Express, Luxury
}

class Bus
{
    String route;
    BusType type;

    public static void main(String[] args)
    {
        Bus b1 = new Bus();
        Bus b2 = new Bus();

        b1.route = "Bangalore";
        b1.type = BusType.Express;

        b2.route = "Mysore";
        b2.type = BusType.Luxury;

        System.out.println(b1.route + " " + b1.type);
        System.out.println(b2.route + " " + b2.type);
    }
}