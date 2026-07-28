class Employee
{
    String ename = "Ravi";
    static String company = "Infosys";

    void employee()
    {
        System.out.println(ename);
    }

    void companyName()
    {
        System.out.println(company);
    }

    void details()
    {
        System.out.println(ename + " " + company);
    }

    public static void main(String[] args)
    {
        Employee e1 = new Employee();
        Employee e2 = new Employee();

        e1.employee();
        e1.companyName();

        e2.details();
    }
}