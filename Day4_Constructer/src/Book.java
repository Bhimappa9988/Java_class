class Book
{
    String title;
    String author;
    int pages;
    int price;
    String language;

    Book(String title, String author, int pages, int price, String language)
    {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.price = price;
        this.language = language;
    }

    public static void main(String[] args)
    {
        Book bk1 = new Book("Java", "James", 500, 650, "English");
        Book bk2 = new Book("Python", "Guido", 450, 550, "English");

        System.out.println(bk1.title + " " + bk1.author + " " + bk1.pages + " " + bk1.price + " " + bk1.language);
        System.out.println(bk2.title + " " + bk2.author + " " + bk2.pages + " " + bk2.price + " " + bk2.language);
    }
}