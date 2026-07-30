final class Printer
{
    void printDocument()
    {
        System.out.println("Document Printed");
    }

    void scanDocument()
    {
        System.out.println("Document Scanned");
    }
}

public class Office
{
    public static void main(String[] args)
    {
        Printer p1 = new Printer();

        p1.printDocument();
        p1.scanDocument();
    }
}