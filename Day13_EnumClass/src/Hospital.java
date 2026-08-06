enum PatientStatus
{
    Admitted, Treatment, Discharged
}

class Hospital
{
    String patient;
    PatientStatus status;

    public static void main(String[] args)
    {
        Hospital h1 = new Hospital();
        Hospital h2 = new Hospital();

        h1.patient = "Rahul";
        h1.status = PatientStatus.Admitted;

        h2.patient = "Anjali";
        h2.status = PatientStatus.Discharged;

        System.out.println(h1.patient + " " + h1.status);
        System.out.println(h2.patient + " " + h2.status);
    }
}