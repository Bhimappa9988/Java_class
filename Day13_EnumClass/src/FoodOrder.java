enum Status
{
    Ordered, Preparing, Delivered
}

class FoodOrder
{
    String item;
    Status status;

    public static void main(String[] args)
    {
        FoodOrder f1 = new FoodOrder();

        f1.item = "Pizza";
        f1.status = Status.Preparing;

        System.out.println(f1.item);
        System.out.println(f1.status);
    }
}