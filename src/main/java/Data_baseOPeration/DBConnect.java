package employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {

private  static  DBClass db= new DBClass();


private  static  final String  url=db.getUrl();
private  static  final String  user=db.getUser();
private  static  final String  password=db.getPassword();


public  static Connection getConnection() throws SQLException
{


        return DriverManager.getConnection(url,user,password);




}



}
