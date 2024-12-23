public class Book {
    public String title;
    public String author;
    public String isbn;
    public String available;

    public Book(String title, String author, String isbn) {

        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.available = available;
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