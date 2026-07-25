class Calculator
{
    void welcome()
    {
        System.out.println("Calculator Program");
    }

    void add(int a, int b)
    {
        System.out.println(a + b);
    }

    public static void main(String[] args)
    {
        Calculator c1 = new Calculator();

        c1.welcome();
        c1.add(10, 20);
    }
}