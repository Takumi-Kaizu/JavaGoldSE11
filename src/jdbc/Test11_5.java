package jdbc;

import java.sql.*;

public class Test11_5 {

    public static void main(String[] args) {
        String sql = "SELECT * FROM department WHERE dept_code = 3";
        try(Connection con = UserDatabase.getConnect();
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery(sql);){
            if(rs != null) {
                while(rs.next()) {
                    System.out.print("Found");
                }
            }else {
                System.out.print("None");
            }
        }catch(SQLException e) {
            System.out.print("SQLException");
            e.printStackTrace();
        }
    }
}
