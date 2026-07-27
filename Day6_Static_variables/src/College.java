class College
{
    String studentName;
    static String college = "ABC College";
    static String city = "Bengaluru";

    College(String name)
    {
        this.studentName = name;
    }

    public static void main(String[] args)
    {
        College c1 = new College("Amit");
        College c2 = new College("Sneha");
        College c3 = new College("Kiran");

        System.out.println(c1.studentName + " " + College.college + " " + College.city);
        System.out.println(c2.studentName + " " + College.college + " " + College.city);
        System.out.println(c3.studentName + " " + College.college + " " + College.city);
    }
}