package Unit_4_Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class A05_Batch {
    public static void main(String[] args) {

        try{

            Class.forName("oracle.jdbc.driver.OracleDriver");
            String url = "jdbc:oracle:thin:@localhost:1521:XE";
            String user = "system";
            String password = "Oracle@143";

            Connection con = DriverManager.getConnection(url,user,password);

            System.out.println("Connected!");

            Statement st = con.createStatement();

            st.addBatch("insert into student1 values(1,'Gaurav')");
            st.addBatch("insert into student1 values(2,'Kaif')");
            st.addBatch("insert into student1 values(3,'Aasif')");

            st.executeBatch();


            con.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
