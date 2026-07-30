final class ATM
{
    void insertCard()
    {
        System.out.println("Card Inserted");
    }

    void withdrawMoney()
    {
        System.out.println("Money Withdrawn");
    }
}

public class Customer
{
    public static void main(String[] args)
    {
        ATM a1 = new ATM();

        a1.insertCard();
        a1.withdrawMoney();
    }
}