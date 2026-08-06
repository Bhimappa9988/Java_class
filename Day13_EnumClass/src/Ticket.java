enum SeatType
{
    Silver, Gold, Platinum
}

class Ticket
{
    String movie;
    SeatType seat;

    public static void main(String[] args)
    {
        Ticket t1 = new Ticket();

        t1.movie = "Kalki";
        t1.seat = SeatType.Gold;

        System.out.println(t1.movie);
        System.out.println(t1.seat);
    }
}