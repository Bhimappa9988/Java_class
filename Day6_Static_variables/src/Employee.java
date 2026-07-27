class Employee
{
    String ename;
    static String company = "TCS";

    Employee(String name)
    {
        this.ename = name;
    }

    public static void main(String[] args)
    {
        Employee e1 = new Employee("Ravi");
        Employee e2 = new Employee("Priya");

        System.out.println(e1.ename + " " + Employee.company);
        System.out.println(e2.ename + " " + Employee.company);
    }
}