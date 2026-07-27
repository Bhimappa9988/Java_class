class Calculator
{
    int sub(int a, int b)
    {
        return a - b;
    }

    public static void main(String[] args)
    {
        Calculator c1 = new Calculator();

        int result = c1.sub(30, 15);

        System.out.println(result);
    }
}
