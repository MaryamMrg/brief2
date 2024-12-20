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

    // Getters et Setters
    public String getTitle() {
        return title; }


    public void setTitle(String title) {
        this.title = title; }

    public String getAuthor() {
        return author; }


    public void setAuthor(String author) {
        this.author = author; }


    public String getIsbn() {
        return isbn; }


    public void setIsbn(String isbn) {
        this.isbn = isbn; }


    public String isAvailable() {
        return available; }


    public void setAvailable(String available) {
        this.available = available; }

    @Override
    public String toString() {
        return "book{" +
                " ' titre= '" + title + '\'' +
                ", 'auteur ='" + author + '\'' +
                ", 'ISBN='" + isbn + '\'' +
                ", 'available= " +'\''+ available +
                '}';
    }
}