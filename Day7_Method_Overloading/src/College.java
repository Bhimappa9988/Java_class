class College
{
    String college = "ABC College";

    void details()
    {
        System.out.println("College");
    }

    void details(String name)
    {
        System.out.println(name);
    }

    void details(int roll)
    {
        System.out.println(roll);
    }

    void details(String name, int roll)
    {
        System.out.println(name + " " + roll);
    }

    void details(String name, String branch)
    {
        System.out.println(name + " " + branch);
    }

    void details(String name, int roll, String branch)
    {
        System.out.println(name + " " + roll + " " + branch);
    }

    public static void main(String[] args)
    {
        College c1 = new College();
        College c2 = new College();

        System.out.println(c1.college);

        c1.details();
        c1.details("Anjali");
        c1.details(25);
        c2.details("Rahul",30);
        c2.details("Sneha","CSE");
        c2.details("Amit",40,"ISE");
    }
}