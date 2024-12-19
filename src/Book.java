public class Book {
    private String Title;
    private String author;
    private String isbn;
    private boolean Avialable;
    public Book(String title, String author, String isbn) {
        this.Title = title;
        this.author = author;
        this.isbn = isbn;
        this.Avialable = true;
    }
    public String getTitle() { return Title; }
    public String getAuthor() { return author; }
    public String getIsbn() { return isbn; }
    public boolean Available() { return Avialable; }
    public void setAvailable(boolean available) { Avialable = Avialable; }
    public String toString() { return "Title: " + Title + ", Author: " + author + ", ISBN: " + isbn + ", Available: " + Avialable;
}
}
