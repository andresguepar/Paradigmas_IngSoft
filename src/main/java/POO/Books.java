package POO;

public class Books {
    private int id;
    private String title;
    private boolean available;

    public Books(int id, String title) {
        this.id = id;
        this.title = title;
        this.available = available;
    }


    public boolean isAvailable() {
        return available;
    }

    public void setUnavailable(){
        this.available = false;
    }

    public void setAvailable() {
        this.available = available;
    }

    @Override
    public String toString() {
        return "Books{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", available=" + available +
                '}';
    }
}
