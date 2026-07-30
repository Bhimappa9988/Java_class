class Bank
{
    private int pin = 1234;

    void display()
    {
        System.out.println("Welcome to Bank");
    }
}

public class Customer extends Bank
{
    public static void main(String[] args)
    {
        Customer c1 = new Customer();

        c1.display();

        // System.out.println(c1.pin);
        // Error: pin has private access
    }
}