class Employee
{
    String name;
    int id;

    Employee(String name, int id)
    {
        this.name = name;
        this.id = id;
    }

    public static void main(String[] args)
    {
        Employee e1 = new Employee("Ravi", 101);
        Employee e2 = new Employee("Priya", 102);

        System.out.println(e1.name + " " + e1.id);
        System.out.println(e2.name + " " + e2.id);
    }
}