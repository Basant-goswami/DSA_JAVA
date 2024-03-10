package Advance_java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//      using postgres database server

public class jdbc_demo {
    public static void main(String[] args) throws SQLException {
        Connection conn = null;
        String url = "jdbc:postgresql://localhost:5432/test";

//        int rollno = 1;
//        String name = "basant";
//        int marks = 89;
//        String sql = "INSERT INTO student (rollno,name,marks)" + "values("+rollno+",'"+name+"',"+marks+")";

        String sql = "INSERT INTO student (rollno,name,marks) values(2,'jitesh',98)";            // query for insertion

        try {
            conn = DriverManager.getConnection(url, "postgres", "Goswami99$");        // connection live (main line)
            Statement st = conn.createStatement();
            int m = st.executeUpdate(sql);              // it returns how many rows are affected

            if (m == 1) {
                System.out.println("insertion successfully : " + sql);
            } else {
                System.out.println("insertion is not success");
            }

        }catch (Exception e){
            System.err.println(e);
        } finally {
            conn.close();           // closing the connection
        }
    }
}
