package Unit_4_Database;

import javax.sound.midi.Soundbank;
import java.sql.*;
import java.util.Scanner;

public class A02_PrepareStatement {
    public static void main(String[] args) {

        try{

            Class.forName("oracle.jdbc.driver.OracleDriver");
            String url = "jdbc:oracle:thin:@localHost:1521:XE";
            String user = "system";
            String pass = "Oracle@143";
            Connection con = DriverManager.getConnection(url,user,pass);

            System.out.println("Connected!");

            // insert data using preparedStatement
//            String query = "insert into student1 values(?,?)";
//            PreparedStatement pst = con.prepareStatement(query);

//            pst.setInt(1,104);    // 1 refer to column number and 104 refer to value
//            pst.setString(2,"Rahul");    // 2 refer to column number and Rahul refer to value
//            pst.executeUpdate();

//            pst.setInt(1,105);
//            pst.setString(2,"Alice");
//            pst.executeUpdate();


//            String query2 = "update student1 set name = ? where id = ?";
//            PreparedStatement pst2 = con.prepareStatement(query2);
//            pst2.setString(1,"Sita");
//            pst2.setInt(2,105);
//            pst2.executeUpdate();


//            String query3 = "delete from student1 where id = ?";
//            PreparedStatement pst2 = con.prepareStatement(query3);
//            pst2.setInt(1,105);
//            pst2.executeUpdate();


//            String query3 = "select * from student1";
//            PreparedStatement pst = con.prepareStatement(query3);
//            ResultSet rs = pst.executeQuery();
//
//            while (rs.next()){
//                System.out.println(rs.getInt(1) + " "+ rs.getString("name"));
//            }

            Scanner sc =new Scanner(System.in);

            System.out.print("Enter id: ");
            int num = sc.nextInt();
            sc.nextLine();  //  consume leftover newline

            System.out.print("Enter name: ");
            String name1 = sc.nextLine();


            String query3 = "insert into student1 values(?,?)";
            PreparedStatement pst = con.prepareStatement(query3);
            pst.setInt(1,num);
            pst.setString(2,name1);
            pst.executeUpdate();





            pst.close();
            con.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
