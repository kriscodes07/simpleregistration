package employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBClass {

private  final String url="jdbc:mysql://localhost:3306/employee ";
private  final String  user="root";
private  final String  password="kkr2025";

    public String getUrl() {
        return url;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }
}
