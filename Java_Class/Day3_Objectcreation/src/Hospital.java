class Hospital {

    String patientName;
    int age;
    String disease;
    int roomNo;
    String doctor;

    public static void main(String[] args) {

        Hospital h1 = new Hospital();
        Hospital h2 = new Hospital();
        Hospital h3 = new Hospital();

        h1.patientName = "Rahul";
        h1.age = 25;
        h1.disease = "Fever";
        h1.roomNo = 101;
        h1.doctor = "Dr. Kumar";

        h2.patientName = "Sneha";
        h2.age = 32;
        h2.disease = "Diabetes";
        h2.roomNo = 102;
        h2.doctor = "Dr. Reddy";

        h3.patientName = "Arun";
        h3.age = 45;
        h3.disease = "Asthma";
        h3.roomNo = 103;
        h3.doctor = "Dr. Mehta";

        System.out.println(h1.patientName);
        System.out.println(h1.age);
        System.out.println(h1.disease);
        System.out.println(h1.roomNo);
        System.out.println(h1.doctor);

        System.out.println(h2.patientName);
        System.out.println(h2.age);
        System.out.println(h2.disease);
        System.out.println(h2.roomNo);
        System.out.println(h2.doctor);

        System.out.println(h3.patientName);
        System.out.println(h3.age);
        System.out.println(h3.disease);
        System.out.println(h3.roomNo);
        System.out.println(h3.doctor);
    }
}