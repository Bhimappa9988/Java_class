enum AccountType
{
    Savings, Current, FixedDeposit
}

class Bank
{
    String customer;
    AccountType type;

    public static void main(String[] args)
    {
        Bank b1 = new Bank();
        Bank b2 = new Bank();

        b1.customer = "Ravi";
        b1.type = AccountType.Savings;

        b2.customer = "Priya";
        b2.type = AccountType.Current;

        System.out.println(b1.customer + " " + b1.type);
        System.out.println(b2.customer + " " + b2.type);
    }
}