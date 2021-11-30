package jdbc;

import java.sql.*;

public class Test11_10 {

    public static void main(String[] args) {
        String sql = "INSERT INTO department VALUES(?, ?, ?, ?)";
        try(Connection con = UserDatabase.getConnect();
                PreparedStatement pstmt = con.prepareStatement(sql)){
            pstmt.setInt(1, 6);
            pstmt.setString(2, "Etc");
            pstmt.setString(3, "Niigata");
            //pstmt.setString(4, "099-555-xxxx");
            int i = pstmt.executeUpdate();
            System.out.print("INSERT");
        }catch(SQLException e) {
            System.out.print("SQLException");
            e.printStackTrace();
        }
    }
}
