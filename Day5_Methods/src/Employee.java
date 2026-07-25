class Employee
{
    void employeeName()
    {
        System.out.println("Rahul");
    }

    void salary()
    {
        System.out.println(35000);
    }

    void addBonus(int salary, int bonus)
    {
        System.out.println(salary + bonus);
    }

    public static void main(String[] args)
    {
        Employee e1 = new Employee();
        Employee e2 = new Employee();

        e1.employeeName();
        e1.salary();

        e2.addBonus(35000, 5000);
    }
}