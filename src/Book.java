public class Book {
    public String title;
    public String author;
    public String isbn;
    public String available;

    public Book(String title, String author, String isbn) {

      title = title;
        author = author;
        isbn = isbn;
        available = available;
    }


    public String toString() {
        return "book{" +
                " ' titre= '" + title + '\'' +
                ", 'auteur ='" + author + '\'' +
                ", 'ISBN='" + isbn + '\'' +
                ", 'available= " +'\''+ available +
                '}';
    }
}