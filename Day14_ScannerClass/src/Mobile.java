import java.util.Scanner;

class Mobile
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Mobile Brand: ");
        String brand = sc.next();

        System.out.print("Enter Price: ");
        int price = sc.nextInt();

        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
    }
}