package Programacion.Funcional;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Manage {
    private List<Task> tasks;

    public Manage() {
        this.tasks = new ArrayList<>();
    }

    public void add(String title) {
        tasks.add(new Task(title));
    }

    public void CompleteTask(int id){
        for (Task ts : tasks) {
            if (ts.getId() == id) {
                ts.completed();
                return;
            }
        }
        System.out.printf("Task "+ id + "not found");
    }
    public List<Task> filter (Predicate<Task> condition){
        return tasks.stream()
                .filter(condition)
                .collect(Collectors.toList());
    }

}
