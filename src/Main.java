
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Book> books = new ArrayList<>();


    public static void displayAllBooks() {

        if(books.size()==0){
            System.out.println("no books yet to display");
            return;
        }

        for (int i = 0; i < books.size(); i++) {

            books.get(i).toString();
            System.out.println(books.get(i));

        }
        System.out.println("the list of books is : ");


    }
    public  static void  addBook (){

        Book newBook = new Book("", "", "");

        System.out.println("enter the Title of the book : ");
        newBook.title = Main.scanner.nextLine();
        System.out.println("enter the author of the book : ");
        newBook.author = Main.scanner.nextLine();
        System.out.println("enter ISBN of the book: ");
        newBook.isbn= Main.scanner.nextLine();
        System.out.println("enter availability of the book ( yes/ no) ");
        newBook.available = Main.scanner.nextLine();

        books.add(newBook);
        System.out.println("book added successfully thank you (^-^)");
    }
    public static void searchBook() {

        System.out.println(" enter the isbn of the book you want to search:");
        String isbn = Main.scanner.nextLine();
        for (int i = 0; i < books.size(); i++) {
            if(books.get(i).isbn.equals(isbn)){
                System.out.println(books.get(i));
                return;
            }
            else{
                System.out.println("book not found");
            }

        }

    }
    public static void removeBook() {
        System.out.println("enter the isbn of the book you want to remove:");
        String isbn = Main.scanner.nextLine();
        for(int i=0;i<books.size();i++){
            if(books.get(i).isbn.equals(isbn)){
                books.remove(i);
                System.out.println("book removed successfully (^-^)");
                return;
            }
            if(books.size()==0){

                System.out.println("book not found");
                return;
            }
        }
    }
    public static void updateBook() {
        System.out.println("enter the isbn of the book you want to update:");
        String isbn = Main.scanner.nextLine();
        for(int i=0;i<books.size();i++){
            if(books.get(i).isbn.equals(isbn)){
                System.out.println("enter the new title of the book:");
                books.get(i).title = Main.scanner.nextLine();
                System.out.println("enter the new author of the book:");
                books.get(i).author = Main.scanner.nextLine();
                System.out.println("enter the new availability of the book:");
                books.get(i).available = Main.scanner.nextLine();
                System.out.println("book updated successfully (^-^)");
                return;
            }else{
                System.out.println("book not found");
            }
        }
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice=0;
        while (choice!=6){
            System.out.println("====System management library====");
            System.out.println("======         MENU        ======");
            System.out.println("1.========  Add a book =========");
            System.out.println("2.======  Display all books ====");
            System.out.println("3.=======  Search a book =======");
            System.out.println("4.=======  Update a book =======");
            System.out.println("5.=======  Remove a book =======");
            System.out.println("6.============= Exit ===========");
            System.out.println("enter your choice please: ");
            choice = scanner.nextInt();
            if(choice==6){
                System.out.println("========== by by (^-^)==========");
                break;
            }
            switch (choice){
                case 1:
                    addBook();
                    break;
                case 2:
                    displayAllBooks();
                    break;

                case 3:
                    searchBook();
                    break;
                case 4:
                    updateBook();
                    break;
                case 5:
                    removeBook();
                    break;

                default:
                    System.out.println("invalid choice");

            }
        }

    }
}