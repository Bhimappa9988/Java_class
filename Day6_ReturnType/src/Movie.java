class Movie
{
    String title;

    void setTitle(String title)
    {
        this.title = title;
    }

    String getTitle()
    {
        return this.title;
    }

    public static void main(String[] args)
    {
        Movie mv1 = new Movie();
        Movie mv2 = new Movie();
        Movie mv3 = new Movie();

        mv1.setTitle("KGF");
        mv2.setTitle("Salaar");
        mv3.setTitle("Max");

        System.out.println(mv1.getTitle());
        System.out.println(mv2.getTitle());
        System.out.println(mv3.getTitle());
    }
}