class ATMCard
{
    String name;
    int pin;
    String bank;

    ATMCard(String name, int pin, String bank)
    {
        this.name = name;
        this.pin = pin;
        this.bank = bank;
        System.out.println(name + " " + pin + " " + bank);
    }

    ATMCard(String name, int pin)
    {
        this.name = name;
        this.pin = pin;
        System.out.println(name + " " + pin);
    }

    ATMCard(String name)
    {
        this.name = name;
        System.out.println(name);
    }

    public static void main(String[] args)
    {
        ATMCard a1 = new ATMCard("Rahul", 1234, "SBI");
        ATMCard a2 = new ATMCard("Sneha", 5678);
        ATMCard a3 = new ATMCard("Kiran");

    }
}