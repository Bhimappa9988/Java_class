class Shopping
{
    String product;
    int quantity;
    String address;

    Shopping(String product, int quantity, String address)
    {
        this.product = product;
        this.quantity = quantity;
        this.address = address;
        System.out.println(product + " " + quantity + " " + address);
    }

    Shopping(String product, int quantity)
    {
        this.product = product;
        this.quantity = quantity;
        System.out.println(product + " " + quantity);
    }

    Shopping(String product)
    {
        this.product = product;
        System.out.println(product);
    }

    public static void main(String[] args)
    {
        Shopping s1 = new Shopping("Laptop", 1, "Bangalore");
        Shopping s2 = new Shopping("Mobile", 2);
        Shopping s3 = new Shopping("Headphones");
    }
}