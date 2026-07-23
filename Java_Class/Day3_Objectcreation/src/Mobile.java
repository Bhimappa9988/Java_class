class Mobile {

    String company;
    String model;
    int price;

    public static void main(String[] args) {

        Mobile m1 = new Mobile();
        Mobile m2 = new Mobile();

        m1.company = "Samsung";
        m1.model = "Galaxy A55";
        m1.price = 40000;

        m2.company = "OnePlus";
        m2.model = "Nord CE";
        m2.price = 28000;

        System.out.println(m1.company);
        System.out.println(m1.model);
        System.out.println(m1.price);

        System.out.println(m2.company);
        System.out.println(m2.model);
        System.out.println(m2.price);
    }
}