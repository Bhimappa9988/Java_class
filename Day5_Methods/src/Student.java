class Student
{
    void studentName()
    {
        System.out.println("Kiran");
    }

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

    public static void main(String[] args)
    {
        Student s1 = new Student();
        Student s2 = new Student();

        s1.studentName();
        s1.add(10, 5);
        s2.sub(20, 8);
        s2.mul(6, 7);
    }
}