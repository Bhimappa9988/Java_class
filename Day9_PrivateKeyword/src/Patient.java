class Hospital
{
    String hospitalName = "City Hospital";

    void admitPatient()
    {
        System.out.println("Patient Admitted");
    }

    private void generateMedicalReport()
    {
        System.out.println("Medical Report Generated");
    }
}

public class Patient extends Hospital
{
    public static void main(String[] args)
    {
        Patient p1 = new Patient();

        System.out.println(p1.hospitalName);
        p1.admitPatient();

        // p1.generateMedicalReport();
        // Error: generateMedicalReport() has private access
    }
}