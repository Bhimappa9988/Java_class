class BankAccount
{
    String accountHolder = "Sneha";
    double balance = 50000;

    void deposit()
    {
        System.out.println("Money Deposited");
    }

    void withdraw()
    {
        System.out.println("Money Withdrawn");
    }

    void checkBalance()
    {
        System.out.println(balance);
    }

    void printStatement()
    {
        System.out.println("Statement Printed");
    }

    void transferMoney()
    {
        System.out.println("Money Transferred");
    }
}

public class SavingsAccount extends BankAccount
{
    public static void main(String[] args)
    {
        SavingsAccount s1 = new SavingsAccount();

        System.out.println(s1.accountHolder);
        s1.deposit();
        s1.withdraw();
        s1.checkBalance();
        s1.printStatement();
        s1.transferMoney();
    }
}