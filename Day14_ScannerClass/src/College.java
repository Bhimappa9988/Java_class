import java.util.Scanner;

class College
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.next();

        System.out.print("Enter Percentage: ");
        double percentage = sc.nextDouble();

        System.out.print("Enter Gender (M/F): ");
        char gender = sc.next().charAt(0);

        System.out.println("Name: " + name);
        System.out.println("Percentage: " + percentage);
        System.out.println("Gender: " + gender);
    }
}