
import java.util.ArrayList;
import java.util.Scanner;

    public class Main {

        static Scanner scanner = new Scanner(System.in);
        static ArrayList<Book> books = new ArrayList<>();


        public static void displayAllBooks() {
            if(books.size()==0){
                System.out.println("no books yet to display");
            }else {
                for (int i = 0; i < books.size(); i++) {

                    books.get(i).toString();
                }
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
        public static void updateBook() {

        }



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int choice=0;
            while (choice!=4){
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
