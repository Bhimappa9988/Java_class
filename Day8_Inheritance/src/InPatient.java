class Patient
{
    String patientName = "Ravi";

    void register()
    {
        System.out.println("Patient Registered");
    }

    void consultDoctor()
    {
        System.out.println("Doctor Consultation Completed");
    }

    void takeMedicine()
    {
        System.out.println("Medicine Collected");
    }

    void payBill()
    {
        System.out.println("Bill Paid");
    }
}

public class InPatient extends Patient
{
    public static void main(String[] args)
    {
        InPatient p1 = new InPatient();

        System.out.println(p1.patientName);
        p1.register();
        p1.consultDoctor();
        p1.takeMedicine();
        p1.payBill();
    }
}