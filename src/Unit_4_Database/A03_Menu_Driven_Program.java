package Unit_4_Database;

import java.sql.*;
import java.util.Scanner;

public class A03_Menu_Driven_Program {
    public static void main(String[] args) {

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            String url = "jdbc:oracle:thin:@localhost:1521:XE";
            String user = "system";
            String pass = "Oracle@143";

            Connection con = DriverManager.getConnection(url, user, pass);
            System.out.println("Connected!");

            Scanner sc = new Scanner(System.in);
            int num;

            do {
                System.out.println("\nEnter ->");
                System.out.println("1 for Insert");
                System.out.println("2 for Update");
                System.out.println("3 for Delete");
                System.out.println("4 for Retrieve");
                System.out.println("0 for Exit");


                System.out.print("Enter your choice: ");

                num = sc.nextInt();

                switch (num) {

                    //  Insert Data
                    case 1: {
                        System.out.print("Enter id: ");
                        int id = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter name: ");
                        String name = sc.nextLine();

                        String query = "INSERT INTO student1 VALUES (?, ?)";
                        PreparedStatement pst = con.prepareStatement(query);
                        pst.setInt(1, id);
                        pst.setString(2, name);

                        pst.executeUpdate();
                        System.out.println("Data Inserted!");
                        break;
                    }

                    // Update
                    case 2: {
                        System.out.print("Enter id to update: ");
                        int id = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter new name: ");
                        String name = sc.nextLine();

                        String query = "UPDATE student1 SET name = ? WHERE id = ?";
                        PreparedStatement pst = con.prepareStatement(query);
                        pst.setString(1, name);
                        pst.setInt(2, id);

                        int rows = pst.executeUpdate();

                        if (rows > 0)
                            System.out.println("Data Updated!");
                        else
                            System.out.println("ID not found!");
                        break;
                    }

                    // Delete
                    case 3: {
                        System.out.print("Enter id to delete: ");
                        int id = sc.nextInt();

                        String query = "DELETE FROM student1 WHERE id = ?";
                        PreparedStatement pst = con.prepareStatement(query);
                        pst.setInt(1, id);

                        int rows = pst.executeUpdate();

                        if (rows > 0)
                            System.out.println("Data Deleted!");
                        else
                            System.out.println("ID not found!");
                        break;
                    }

                    // Retrieve Data
                    case 4: {
                        String query = "SELECT * FROM student1";
                        Statement st = con.createStatement();
                        ResultSet rs = st.executeQuery(query);

                        System.out.println("\nID\tNAME");

                        while (rs.next()) {
                            int id = rs.getInt(1);
                            String name = rs.getString(2);
                            System.out.println(id + "\t" + name);
                        }
                        break;
                    }

                    case 0:
                        System.out.println("Program exit");
                        break;

                    default:
                        System.out.println("Invalid choice!");
                }

            } while (num != 0);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}