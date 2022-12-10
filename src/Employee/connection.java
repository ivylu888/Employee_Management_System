package Employee;

import java.sql.*;

public class connection {

  public Connection c;
  public Statement s;

  public connection(){
    try{
      Class.forName("com.mysql.jdbc.Driver");
      c =DriverManager.getConnection("jdbc:mysql://localhost:3306/ems01","ivyems","password");
      s =c.createStatement();
    }catch(Exception e) {
      e.printStackTrace();
    }
  }
}