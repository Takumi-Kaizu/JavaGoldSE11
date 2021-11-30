package jdbc;

import java.sql.*;

public class Test11_4 {

    public static void main(String[] args) {
        String sql = "SELECT dept_name, dept_code, dept_address FROM department WHERE dept_code = 1";
        try(Connection con = UserDatabase.getConnect();
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery(sql);) {
            while(rs.next()) {
                System.out.print(rs.getString(2));
            }
        } catch (SQLException e) {
            System.out.print("SQLException");
            e.printStackTrace();
        }
    }
}
