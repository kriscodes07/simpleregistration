package employee;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmployeeDAO {


    public  void register(employee.Model1 model1) throws SQLException {


        String query="insert into employee(ename,emial,postion,location,password,contact) values(?,?,?,?,?,?)";


        try {
            Connection connection= employee.DBConnect.getConnection();
            PreparedStatement preparedStatement=connection.prepareStatement(query);
            preparedStatement.setString(1,model1.getEname());
            preparedStatement.setString(2,model1.getEmail());
            preparedStatement.setString(3,model1.getPosition());
            preparedStatement.setString(4,model1.getLocation());
            preparedStatement.setString(5,model1.getPassword());
            preparedStatement.setInt(6,model1.getContact());

            preparedStatement.executeUpdate();

        }catch(SQLException e){
            e.printStackTrace();

        }




    }


}
