package Programacion.Reactiva;

public class Package {
    private String id;
    private Status status;
    private String address;

    public Package(String id) {
        this.id = id;
        this.status = status;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void updateStatus(Status status, String address) {
        this.status = status;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Package{" +
                "id='" + id + '\'' +
                ", status=" + status +
                ", address='" + address + '\'' +
                '}';
    }
}
