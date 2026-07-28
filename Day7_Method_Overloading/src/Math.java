class Math
{
    int value = 100;

    void multiply(int a, int b)
    {
        System.out.println(a * b);
    }

    void multiply(int a, int b, int c)
    {
        System.out.println(a * b * c);
    }

    void multiply(double a, double b)
    {
        System.out.println(a * b);
    }

    void multiply(int a, double b)
    {
        System.out.println(a * b);
    }

    void multiply(String msg, int a)
    {
        System.out.println(msg + " " + a);
    }

    public static void main(String[] args)
    {
        Math m1 = new Math();
        Math m2 = new Math();
        Math m3 = new Math();

        System.out.println(m1.value);

        m1.multiply(5,6);
        m1.multiply(2,3,4);
        m2.multiply(2.5,4.0);
        m2.multiply(5,2.5);
        m3.multiply("Answer",50);
    }
}