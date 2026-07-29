class FoodOrder
{
    String item;
    int quantity;
    double price;

    FoodOrder(String item, int quantity, double price)
    {
        this.item = item;
        this.quantity = quantity;
        this.price = price;
        System.out.println(item + " " + quantity + " " + price);
    }

    FoodOrder(String item, int quantity)
    {
        this.item = item;
        this.quantity = quantity;
        System.out.println(item + " " + quantity);
    }

    FoodOrder(String item)
    {
        this.item = item;
        System.out.println(item);
    }

    public static void main(String[] args)
    {
        FoodOrder f1 = new FoodOrder("Pizza", 2, 499);
        FoodOrder f2 = new FoodOrder("Burger", 3);
        FoodOrder f3 = new FoodOrder("Sandwich");
    }
}