class Hospital
{
    String patientName;
    int age;
    String disease;

    Hospital(String patientName, int age, String disease)
    {
        this.patientName = patientName;
        this.age = age;
        this.disease = disease;
    }

    public static void main(String[] args)
    {
        Hospital h1 = new Hospital("Rahul", 25, "Fever");
        Hospital h2 = new Hospital("Sneha", 30, "Diabetes");

        System.out.println(h1.patientName + " " + h1.age + " " + h1.disease);
        System.out.println(h2.patientName + " " + h2.age + " " + h2.disease);
    }
}