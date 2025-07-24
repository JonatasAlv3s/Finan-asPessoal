package dobackaofront;

public class Bills  {
    private int id;
    private String created_at;
    private String update_at;
    private Status status;

    public Bills(int id, String created_at, String update_at, Status status) {
        this.id = id;
        this.created_at = created_at;
        this.update_at = update_at;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getUpdate_at() {
        return update_at;
    }

    public void setUpdate_at(String update_at) {
        this.update_at = update_at;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void show() {
        System.out.println("Código: " +id);
        System.out.println("Criado em: " +created_at);
        System.out.println("Atualizado em: " +update_at);
        System.out.println("Status: " +status);
    }
}
