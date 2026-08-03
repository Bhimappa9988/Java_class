class Bank
{
    void calculateInterest(float rate)
    {
        System.out.println("Interest Rate: " + rate);
    }
}

class SBIBank extends Bank
{
    @Override
    void calculateInterest(float rate)
    {
        System.out.println("SBI Interest Rate: " + rate);
    }

    public static void main(String[] args)
    {
        SBIBank s1 = new SBIBank();
        Bank b1 = new Bank();

        s1.calculateInterest(6.5f);
        b1.calculateInterest(5.5f);
    }
}