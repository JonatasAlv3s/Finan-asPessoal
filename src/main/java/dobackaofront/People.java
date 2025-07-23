package dobackaofront;

public class People {
    private int id;
    private String name;
    private String last_name;
    private String cpf;
    private String birth_date;
    private String email;
    private String password;

    public People(int id, String name, String last_name, String cpf, String birth_date, String email, String password) {
        this.id = id;
        this.name = name;
        this.last_name = last_name;
        this.cpf = cpf;
        this.birth_date = birth_date;
        this.email = email;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(String birth_date) {
        this.birth_date = birth_date;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void show () {
        System.out.println(id);
        System.out.println(name);
        System.out.println(last_name);
        System.out.println(cpf);
        System.out.println(birth_date);
        System.out.println(email);
        System.out.println(password);
    }
}
