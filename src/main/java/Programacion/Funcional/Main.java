package Programacion.Funcional;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Manage mn = new Manage();

        mn.add("Draw");
        mn.add("Lunch");
        mn.add("Cat");
        mn.CompleteTask(0);

        List<Task> complete = mn.filter(Task::isCompleted);
        System.out.print("====================\n");
        System.out.print("Complete:");
        complete.forEach(System.out::println);
    }
}
