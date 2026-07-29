class Student
{
    String studentName = "Anjali";
    int rollNo = 101;

    void login()
    {
        System.out.println("Login Successful");
    }

    void viewAttendance()
    {
        System.out.println("Attendance Displayed");
    }

    void viewMarks()
    {
        System.out.println("Marks Displayed");
    }

    void payFees()
    {
        System.out.println("Fees Paid");
    }

    void downloadHallTicket()
    {
        System.out.println("Hall Ticket Downloaded");
    }

    void registerCourse()
    {
        System.out.println("Course Registered");
    }

    void logout()
    {
        System.out.println("Logged Out");
    }
}

public class EngineeringStudent extends Student
{
    public static void main(String[] args)
    {
        EngineeringStudent e1 = new EngineeringStudent();

        System.out.println(e1.studentName);
        System.out.println(e1.rollNo);

        e1.login();
        e1.viewAttendance();
        e1.viewMarks();
        e1.payFees();
        e1.downloadHallTicket();
        e1.registerCourse();
        e1.logout();
    }
}