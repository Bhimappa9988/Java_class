class Book
{
    String title;
    String author;
    int pages;

    Book(String title,String author,int pages)
    {
        this.title=title;
        this.author=author;
        this.pages=pages;
        System.out.println(title+" "+author+" "+pages);
    }

    Book(String title,String author)
    {
        this.title=title;
        this.author=author;
        System.out.println(title+" "+author);
    }

    Book(String title)
    {
        this.title=title;
        System.out.println(title);
    }

    public static void main(String args[])
    {
        Book b1=new Book("Java","James",500);
        Book b2=new Book("Python","Guido");
        Book b3=new Book("C Programming");
    }
}