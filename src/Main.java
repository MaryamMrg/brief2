
import java.util.ArrayList;
import java.util.Scanner;

    public class Main {

        static Scanner scanner = new Scanner(System.in);
        static ArrayList<Book> books = new ArrayList<>();


        public static void displayAllBooks() {
            for (int i = 0; i < books.size(); i++) {

                books.get(i).toString();
            }
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
            newBook.available = Main.scanner.nextBoolean();

            books.add(newBook);
        }

        public static void searchBook() {

        }
        public static void removeBook() {


        }


        public static void main(String[] args) {

        }
    }
