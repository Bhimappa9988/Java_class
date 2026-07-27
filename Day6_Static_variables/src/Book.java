class Book
{
    String title;
    static String author = "James";
    static String language = "English";

    Book(String title)
    {
        this.title = title;
    }

    public static void main(String[] args)
    {
        Book bk1 = new Book("Java");
        Book bk2 = new Book("Python");

        System.out.println(bk1.title + " " + Book.author + " " + Book.language);
        System.out.println(bk2.title + " " + Book.author + " " + Book.language);
    }
}