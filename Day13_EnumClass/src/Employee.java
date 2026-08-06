enum Department
{
    HR, IT, SALES, FINANCE
}

class Employee
{
    String name;
    Department dept;

    public static void main(String[] args)
    {
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Employee e3 = new Employee();

        e1.name = "Amit";
        e1.dept = Department.IT;

        e2.name = "Sneha";
        e2.dept = Department.HR;

        e3.name = "Kiran";
        e3.dept = Department.FINANCE;

        System.out.println(e1.name + " " + e1.dept);
        System.out.println(e2.name + " " + e2.dept);
        System.out.println(e3.name + " " + e3.dept);
    }
}