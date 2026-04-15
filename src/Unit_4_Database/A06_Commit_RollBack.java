package Unit_4_Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class A06_Commit_RollBack {
    public static void main(String[] args) {

        Connection con = null;

        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String url = "jdbc:oracle:thin:@localhost:1521:XE";
            String user = "system";
            String password = "Oracle@143";

            con = DriverManager.getConnection(url,user,password);

            con.setAutoCommit(false);
            Statement st = con.createStatement();
            st.executeQuery("insert into student1 values(5,'Jatin')");
            con.commit();

            System.out.println("Connected!");
        }catch (Exception e){
            try{
                con.rollback();
            }catch (SQLException e1){
                e1.printStackTrace();
            }
        }
    }
}
