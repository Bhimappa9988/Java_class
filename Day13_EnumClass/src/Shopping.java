enum PaymentMode
{
    Cash, Card, UPI
}

class Shopping
{
    String product;
    PaymentMode payment;

    public static void main(String[] args)
    {
        Shopping s1 = new Shopping();

        s1.product = "Laptop";
        s1.payment = PaymentMode.UPI;

        System.out.println(s1.product);
        System.out.println(s1.payment);
    }
}