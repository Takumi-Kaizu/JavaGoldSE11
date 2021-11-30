package jdbc;

import java.sql.*;

public class Test11_11 {

    public static void main(String[] args) {
        String sql = "INSERT INTO department VALUES (6, ?, ?, ?)";
        try(Connection con = UserDatabase.getConnect();
                PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1, "Etc");
            pstmt.setString(2, "Niigata");
            pstmt.setString(3, "094-555-xxxx");
            pstmt.setInt(4, 99);
            int i = pstmt.executeUpdate();
            System.out.print("INSERT");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
