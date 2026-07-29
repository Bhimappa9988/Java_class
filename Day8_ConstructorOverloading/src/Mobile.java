class Mobile
{
    String company;
    String model;
    int price;
    int ram;

    Mobile(String company,String model,int price,int ram)
    {
        this.company=company;
        this.model=model;
        this.price=price;
        this.ram=ram;
        System.out.println(company+" "+model+" "+price+" "+ram);
    }

    Mobile(String company,String model,int price)
    {
        this.company=company;
        this.model=model;
        this.price=price;
        System.out.println(company+" "+model+" "+price);
    }

    Mobile(String company,String model)
    {
        this.company=company;
        this.model=model;
        System.out.println(company+" "+model);
    }

    Mobile(String company)
    {
        this.company=company;
        System.out.println(company);
    }

    public static void main(String args[])
    {
        Mobile m1=new Mobile("Samsung","A55",40000,8);
        Mobile m2=new Mobile("OnePlus","Nord",30000);
        Mobile m3=new Mobile("Vivo","V50");
        Mobile m4=new Mobile("Oppo");
    }
}