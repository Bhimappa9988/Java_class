class Student
{
    String name = "Rahul";
    static String college = "ABC College";

    void displayName()
    {
        System.out.println(name);
    }

    void displayCollege()
    {
        System.out.println(college);
    }

    public static void main(String[] args)
    {
        Student s1 = new Student();

        s1.displayName();
        s1.displayCollege();
    }
}