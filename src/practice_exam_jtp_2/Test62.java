package practice_exam_jtp_2;

import java.sql.*;

public class Test62 {
    public static void main(String[] args) {
        String sql = "SELECT * FROM department";
        try (Connection con = UserDatabase.getConnect();
             PreparedStatement pstmt = con.prepareStatement(
                                sql,
                                ResultSet.TYPE_SCROLL_INSENSITIVE,
                                ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = pstmt.executeQuery()) {
            rs.last();
            System.out.print(rs.getString(1) + " : ");
            rs.relative(0);
            System.out.print(rs.getString(1) + " : ");
            // absolute に 0 を指定すると SQLException をスローする
            rs.absolute(-1);
            System.out.print(rs.getString(1));
        } catch (SQLException e) {
            System.out.print("SQLException");
        }
    }
}
