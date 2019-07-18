
package banking_application;

import java.sql.*;

public class Javaconnect {
            Connection con=null;
    public static Connection getConnection(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","123");
            return con;
        
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    
    }
}
