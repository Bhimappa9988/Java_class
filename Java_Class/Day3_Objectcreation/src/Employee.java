class Employee {

    // Instance variables
    String ename;
    int eid;
    int salary;

    public static void main(String[] args) {

        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Employee e3 = new Employee();

        e1.ename = "Ravi";
        e1.eid = 101;
        e1.salary = 35000;

        e2.ename = "Priya";
        e2.eid = 102;
        e2.salary = 42000;
        
        e3.ename = "Sai";
        e3.eid = 103;
        e3.salary = 45000;

        System.out.println(e1.ename);
        System.out.println(e1.eid);
        System.out.println(e1.salary);

        System.out.println(e2.ename);
        System.out.println(e2.eid);
        System.out.println(e2.salary);
        
        System.out.println(e3.ename);
        System.out.println(e3.eid);
        System.out.println(e3.salary);
    }
}