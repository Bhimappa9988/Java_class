class Hospital
{
    String patient = "Kiran";
    int room = 101;
    static String doctor = "Dr. Kumar";

    void patientName()
    {
        System.out.println(patient);
    }

    void roomNumber()
    {
        System.out.println(room);
    }

    void doctorName()
    {
        System.out.println(doctor);
    }

    void patientDetails()
    {
        System.out.println(patient + " " + room + " " + doctor);
    }

    public static void main(String[] args)
    {
        Hospital h1 = new Hospital();
        Hospital h2 = new Hospital();

        h1.patientName();
        h1.roomNumber();
        h2.doctorName();
        h2.patientDetails();
    }
}