class MathDemo
{
    int multiply(int a, int b)
    {
        return a * b;
    }

    public static void main(String[] args)
    {
        MathDemo m1 = new MathDemo();

        int ans = m1.multiply(6, 8);

        System.out.println(ans);
    }
}
