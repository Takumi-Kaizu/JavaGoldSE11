package jdbc;

import java.sql.*;

public class Test11_12 {

    public static void main(String[] args) {
        String sql = "INSERT INTO department VALUES (?, ?, ?, ?)";
        try(Connection con = UserDatabase.getConnect();
                PreparedStatement pstmt = con.prepareStatement(sql)){
            pstmt.setInt(1, 6);
            pstmt.setString(2, "Etc1");
            pstmt.setString(3, "Niigata");
            pstmt.setString(4, "094-222-xxxx");
            pstmt.executeUpdate();
            pstmt.setInt(1, 7);
            pstmt.executeUpdate();
            System.out.print("INSERT Success");
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
