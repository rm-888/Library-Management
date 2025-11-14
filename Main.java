import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n----- Library Management System -----");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Search Book by Title");
            System.out.println("4. Issue Book");
            System.out.println("5. Return Book");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter Book ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Book Title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter Author Name: ");
                    String author = sc.nextLine();

                    library.addBook(new Book(id, title, author));
                    break;

                case 2:
                    library.viewBooks();
                    break;

                case 3:
                    System.out.print("Enter Title to Search: ");
                    String searchTitle = sc.nextLine();
                    library.searchByTitle(searchTitle);
                    break;

                case 4:
                    System.out.print("Enter Book ID to Issue: ");
                    int issueId = sc.nextInt();
                    library.issueBook(issueId);
                    break;

                case 5:
                    System.out.print("Enter Book ID to Return: ");
                    int returnId = sc.nextInt();
                    library.returnBook(returnId);
                    break;

                case 6:
                    System.out.println("Exiting... Thank you!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
