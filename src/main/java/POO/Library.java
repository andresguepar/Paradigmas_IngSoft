package POO;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Books> books;
    public Library(){
        this.books = new ArrayList<>();
    }
    public void add(int id, String name){
        books.add(new Books(id, name));
    }
    public void lendB(int id){
        if(books.contains(id) && books.get(id).isAvailable() == true){
            books.get(id).setUnavailable();
        }else{
            System.out.println("Invalid book");
        }
    }
    public void returnB(int id){
        if(books.contains(id) && books.get(id).isAvailable() == false){
            books.get(id).setAvailable();
        }else{
            System.out.println("Invalid book");
        }
    }
    public List<Books> getBooks(){
        return books;
    }
}
