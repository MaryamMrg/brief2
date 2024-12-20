public class Book {
    public String title;
    public String author;
    public String isbn;
    public boolean available;

    public Book(String title, String author, String isbn) {

        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.available = true;
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


    public boolean isAvailable() {
        return available; }


    public void setAvailable(boolean available) {
        this.available = available; }

    @Override
    public String toString() {
        return "Livre{" +
                "titre= " + title + '\'' +
                ", auteur ='" + author + '\'' +
                ", ISBN='" + isbn + '\'' +
                ", disponible= " + available +
                '}';
    }
}