public class Book {
    public String author;
    public String name;
    public int year;
    public int page;

    public String toString(){
        String s = "Author: " + author + "\n" + "Name: " + name + "\n" + "Year: " + year + "\n" + "Pages: " + page + "\n";
        return s;
    }
}
