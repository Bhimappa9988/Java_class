class Book
{
    String title = "Java";
    int pages = 500;
    static String author = "James";

    void bookTitle()
    {
        System.out.println(title);
    }

    void pageCount()
    {
        System.out.println(pages);
    }

    void authorName()
    {
        System.out.println(author);
    }

    public static void main(String[] args)
    {
        Book b1 = new Book();

        b1.bookTitle();
        b1.pageCount();
        b1.authorName();
    }
}