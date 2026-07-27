class Student
{
    String sname;

    void setStudent(String name)
    {
        this.sname = name;
    }

    String getStudent()
    {
        return this.sname;
    }

    public static void main(String[] args)
    {
        Student s1 = new Student();

        s1.setStudent("Kiran");

        System.out.println(s1.getStudent());
    }
}