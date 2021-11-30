package jdbc;

import java.sql.*;

public class Test11_1 {

    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        String sql = "SELECT * FROM department";

        try {
            String dburl = "jdbc:mysql://localhost:3306/golddb";
            con = DriverManager.getConnection(dburl, "root", "Test1234");
            pstmt = con.prepareStatement(sql);
            rs = pstmt.executeQuery();
            while(rs.next()) {
                System.out.println("dept_code : " + rs.getInt(1));
                System.out.println("dept_name : " + rs.getString(2));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if(rs != null) {
                    rs.close();
                }
                if(pstmt != null) {
                    pstmt.close();
                }
                if(con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
