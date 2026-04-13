package Unit_4_Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class A04_Scrolls {
    public static void main(String[] args) {

        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String url = "jdbc:oracle:thin:@localHost:1521:XE";
            String user = "system";
            String pass = "Oracle@143";
            Connection con = DriverManager.getConnection(url,user,pass);

            System.out.println("Connected!");

            Statement st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);

            ResultSet rs = st.executeQuery("Select * from student1");

            while(rs.next()){
                System.out.println(rs.getInt("id") + "  "+ rs.getString("name"));
            }

            System.out.println("==== Backward ====");

            rs.afterLast();
            while(rs.previous()){
                System.out.println(rs.getInt("id") + "  "+ rs.getString("name"));
            }

            System.out.println("==== nth position ====");

            rs.absolute(5);
            while(rs.previous()){
                System.out.println(rs.getInt("id") + "  "+ rs.getString("name"));
            }

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
