class MathDemo
{
    void add(int a, int b)
    {
        System.out.println(a + b);
    }

    void sub(int a, int b)
    {
        System.out.println(a - b);
    }

    void multiply(int a, int b)
    {
        System.out.println(a * b);
    }

    public static void main(String[] args)
    {
        MathDemo m1 = new MathDemo();

        m1.add(20, 10);
        m1.sub(20, 10);
        m1.multiply(20, 10);
    }
}