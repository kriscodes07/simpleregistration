package employee;

public class Model1 {



    private  String ename;
    private  String email;
    private  String position;
    private  String location;
    private  String password;
    private  int contact;
    private  int id;

    public Model1(String ename, String email, String position, String location, String password, int contact) {
        this.ename = ename;
        this.email = email;
        this.position = position;
        this.location = location;
        this.password = password;
        this.contact = contact;
    }

    public Model1(String ename, String email, String position, String location, String password, int contact, int id) {
        this.ename = ename;
        this.email = email;
        this.position = position;
        this.location = location;
        this.password = password;
        this.contact = contact;
        this.id = id;
    }


    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getContact() {
        return contact;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }
}
