class Student
{

    void display()
    {
        System.out.println("Student");
    }

    void display(String name)
    {
        System.out.println(name);
    }

    void display(int age)
    {
        System.out.println(age);
    }

    void display(String name, int age)
    {
        System.out.println(name + " " + age);
    }

    public static void main(String[] args)
    {
        Student s1 = new Student();
        Student s2 = new Student();

        s1.display();
        s1.display("Kiran");
        s2.display(21);
        s2.display("Rohit",22);
    }
}