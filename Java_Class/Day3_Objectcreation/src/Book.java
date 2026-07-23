class Book {

    String title;
    String author;
    int pages;
    int price;
    String language;

    public static void main(String[] args) {

        Book bk1 = new Book();
        Book bk2 = new Book();

        bk1.title = "Java";
        bk1.author = "James";
        bk1.pages = 500;
        bk1.price = 650;
        bk1.language = "English";

        bk2.title = "Python";
        bk2.author = "Guido";
        bk2.pages = 450;
        bk2.price = 550;
        bk2.language = "English";

        System.out.println(bk1.title);
        System.out.println(bk1.author);
        System.out.println(bk1.pages);
        System.out.println(bk1.price);
        System.out.println(bk1.language);

        System.out.println(bk2.title);
        System.out.println(bk2.author);
        System.out.println(bk2.pages);
        System.out.println(bk2.price);
        System.out.println(bk2.language);
    }
}