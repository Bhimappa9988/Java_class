class Employee
{
    int salary = 50000;

    void work()
    {
        System.out.println("Working");
    }

    void attendMeeting()
    {
        System.out.println("Attending Meeting");
    }
}

public class Manager extends Employee
{
    public static void main(String[] args)
    {
        Manager m1 = new Manager();

        System.out.println(m1.salary);
        m1.work();
        m1.attendMeeting();
    }
}