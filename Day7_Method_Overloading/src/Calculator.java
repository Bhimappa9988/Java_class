class Calculator
{
    String cname = "Simple Calculator";

    void add(int a, int b)
    {
        System.out.println(a + b);
    }

    void add(int a, int b, int c)
    {
        System.out.println(a + b + c);
    }

    void add(double a, double b)
    {
        System.out.println(a + b);
    }

    public static void main(String[] args)
    {
        Calculator c1 = new Calculator();

        System.out.println(c1.cname);
        c1.add(10, 20);
        c1.add(10, 20, 30);
        c1.add(10.5, 20.5);
    }
}