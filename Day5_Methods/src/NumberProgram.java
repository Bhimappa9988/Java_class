class NumberProgram
{
    void add(int a, int b)
    {
        System.out.println(a + b);
    }

    void sub(int a, int b)
    {
        System.out.println(a - b);
    }

    void mul(int a, int b)
    {
        System.out.println(a * b);
    }

    void div(int a, int b)
    {
        System.out.println(a / b);
    }

    void mod(int a, int b)
    {
        System.out.println(a % b);
    }

    public static void main(String[] args)
    {
        NumberProgram n1 = new NumberProgram();

        n1.add(15, 5);
        n1.sub(15, 5);
        n1.mul(15, 5);
        n1.div(15, 5);
        n1.mod(15, 4);
    }
}