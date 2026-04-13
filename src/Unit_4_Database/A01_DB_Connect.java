package Unit_4_Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;

public class A01_DB_Connect {
    public static void main(String[] args) {

        try{
                Class.forName("oracle.jdbc.driver.OracleDriver");
                String url = "jdbc:oracle:thin:@localHost:1521:XE";
                String user = "system";
                String pass = "Oracle@143";
                Connection con = DriverManager.getConnection(url,user,pass);

                System.out.println("Connected Successfully!");

            Statement st = con.createStatement(); // create a statement for database


//            String query = "create table student1 (id number primary key, name varchar(20))";
//            st.executeUpdate(query);
//            System.out.println("Table created successful!");


//            st.executeUpdate("INSERT INTO student1 VALUES (101, 'Faisal Khan')");
//            st.executeUpdate("INSERT INTO student1 VALUES (102, 'Gourab')");
//            st.executeUpdate("INSERT INTO student1 VALUES (103, 'Hemant')");
//            System.out.println("Data insertion successful!");



//            String query = "update student1 set name = 'Anas' where id = 103";
//            st.executeUpdate(query);


//            String query = "delete from student1 where id = 102";
//            int n = st.executeUpdate(query);
//            System.out.println(n + " rows affected");
//            st.executeUpdate(query);



            Scanner sc = new Scanner(System.in);
            System.out.print("Enter id to get info: ");
            int num = sc.nextInt();
            String query = "select * from student1 where id = "+num+" ";

            ResultSet rs = st.executeQuery(query);

            while(rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");

                System.out.println(id +"  "+name);
            }




            st.close();
            con.close();

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
