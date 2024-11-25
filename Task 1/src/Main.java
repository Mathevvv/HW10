import java.util.Scanner;

public class Main {
    static String booksInfo = "";


    public static void main(String[] args) {
        while (true) {
            String name = inputBookName();
            int pageCount = inputPageCount();
            int cost = inputCost();
            addBook(name);
            addBook(name, pageCount);
            addBook(name, pageCount, cost);
            //todo использовать новый метод тут
            printInfo();
        }
    }

    private static int inputCost() {
        System.out.println("Введите стоимость книги в ржублях:");
        return new Scanner(System.in).nextInt();
    }

    public static String inputBookName() {
        System.out.println("Введите название книги:");
        return new Scanner(System.in).nextLine();
    }

    public static int inputPageCount() {
        System.out.println("Введите кол-во страниц:");
        return new Scanner(System.in).nextInt();
    }

    public static void addBook(String bookName) {
        addBook(bookName, 0, 0);
    }

    public static void addBook(String bookName, int pageCount) {
        addBook(bookName, pageCount, 0);
    }

    public static void addBook(String bookName, int pageCount, int cost) {
        booksInfo = booksInfo + bookName + " - " + (pageCount > 0 ? pageCount : "N/A") + " стр." + " - " + (cost > 0 ? cost : "N/A") + " руб.\n";
    }

    public static void printInfo() {
        System.out.println(booksInfo);
    }

}
