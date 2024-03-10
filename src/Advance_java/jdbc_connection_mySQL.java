package Advance_java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc_connection_mySQL {
    public static void main(String[] args) throws SQLException {
        Connection conn = null;

        String url = "jdbc:mysql://localhost:3306/demo";

        try{
            String sql = "INSERT INTO Teacher(name,age,subject) values('prem',22,'History')";
            conn = DriverManager.getConnection(url,"root","Goswami99$");  // connection live
            Statement st = conn.createStatement();      // creating a statement like update, delete, insert...
            int m = st.executeUpdate(sql);      // executing a query

            if(m == 1){
                System.out.println("connection successfull : " + sql);
            } else {
                System.out.println("connection not established");
            }
        } catch (Exception e){
            System.err.println(e);
        } finally {
            conn.close();
        }
    }
}
