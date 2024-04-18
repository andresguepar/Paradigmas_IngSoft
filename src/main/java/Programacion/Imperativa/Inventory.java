package Programacion.Imperativa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Inventory {
    private final List<Product> inventory;
    public Inventory() {
        this.inventory = new ArrayList<>();
    }


    public void add(String name, int amount) {
        for (Product pr : inventory) {
            if (pr.getName().equals(name)) {
                System.out.println("Product already exists: " + name);
                return;
            }
        }
        inventory.add(new Product(name, amount));
        System.out.println("Product added: " + name + " || Amount: " + amount);
    }

    public void delete(String name) {
        for (Product pr : inventory) {
            if (pr.getName().equals(name)) {
                inventory.remove(pr);
                System.out.println("Product deleted: " + name);
                return;
            }
        }
        System.out.println("Product doesn't exist: " + name);
    }

    public void update(String name, int amount) {
        for (Product pr : inventory) {
            if (pr.getName().equals(name)) {
                pr.setAmount(amount);
                System.out.println("Amount updated for " + name + " || " + amount);
                return;
            }
        }
        System.out.println("Product doesn't exist: " + name);
    }

    public void show() {
        System.out.printf("================================\n");
        System.out.println("Inventory:");
        for (Product pr : inventory) {
            System.out.println(pr.getName() + " - Amount: " + pr.getAmount());
        }
    }
}
