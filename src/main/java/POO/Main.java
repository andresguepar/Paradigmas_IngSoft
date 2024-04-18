package POO;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        library.add(1, "Aquiles Song");
        library.add(2, "Carry On");
        library.add(3, "Half Bad");

        System.out.println("Available Books:");
        library.getBooks();

        library.lendB(3);

        System.out.println("\nAvailable books after lend:");
        library.getBooks();

        library.returnB(1);

        System.out.println("\nAvailable books after return it:");
        library.getBooks();

        library.lendB(4);
    }
}
