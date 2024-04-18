package Programacion.Imperativa;

public class Main {
    public static void main(String[] args) {
        Inventory inv = new Inventory();

        inv.add("Vanilla Ice Cream", 30);
        inv.add("Lemon Pie", 15);
        inv.show();

        inv.update("Lemon Pie", 10);
        inv.show();

        inv.delete("Vanilla Ice cream");
        inv.show();
    }
}
