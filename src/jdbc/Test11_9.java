package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test11_9 {

    public static void main(String[] args) {
        String sql = "SELECT * FROM department WHERE dept_code = ?";
        try(Connection con = UserDatabase.getConnect();
                PreparedStatement pstmt = con.prepareStatement(sql);) {
            pstmt.setInt(1, 3);
            try (ResultSet rs = pstmt.executeQuery()){
                while(rs.next()) {
                    System.out.print(rs.getString(2) + " : " + rs.getString(3));
                }
            }
        } catch (SQLException e) {
            System.out.print("SQLException");
            e.printStackTrace();
        }
    }
}
