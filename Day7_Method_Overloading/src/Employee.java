class Employee
{
    String company = "Infosys";

    void salary(int sal)
    {
        System.out.println(sal);
    }

    void salary(int sal, int bonus)
    {
        System.out.println(sal + bonus);
    }

    void salary(double sal)
    {
        System.out.println(sal);
    }

    public static void main(String[] args)
    {
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Employee e3 = new Employee();

        System.out.println(e1.company);

        e1.salary(30000);
        e2.salary(30000,5000);
        e3.salary(45000.50);
    }
}