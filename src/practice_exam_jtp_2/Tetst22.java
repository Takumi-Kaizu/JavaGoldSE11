package practice_exam_jtp_2;

import java.sql.*;

public class Tetst22 {
    public static void main(String[] args) {
        String sql = "SELECT * FROM department WHERE dept_code = 1";
        try (Connection con = UserDatabase.getConnect();
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(sql);) {
            ResultSetMetaData rsmd = rs.getMetaData();
            int count = rsmd.getColumnCount();
            while (rs.next()) {
                for (int i = 1; i <= count; i++) {
                    System.out.print
                             (rsmd.getColumnName(i) + " ");
                }
            }
        } catch (SQLException e) {
            System.out.print("SQLException");
        }
    }
}
