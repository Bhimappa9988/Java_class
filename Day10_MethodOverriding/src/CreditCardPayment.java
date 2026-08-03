class Payment
{
    void pay(double amount)
    {
        System.out.println("Cash Payment: " + amount);
    }
}

class CreditCardPayment extends Payment
{
    @Override
    void pay(double amount)
    {
        System.out.println("Credit Card Payment: " + amount);
    }

    public static void main(String[] args)
    {
        CreditCardPayment c1 = new CreditCardPayment();
        Payment p1 = new Payment();

        c1.pay(2500.50);
        p1.pay(2500.50);
    }
}