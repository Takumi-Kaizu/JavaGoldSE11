package practice_exam_jtp_2;

import java.sql.*;

/**
 * DB への接続を行うクラス。
 * @author mii15
 */
public class UserDatabase {
    protected static Connection getConnect() {
        String dburl = "jdbc:mysql://localhost:3306/golddb";
        Connection con = null;
        try {
            con = DriverManager.getConnection(dburl, "root", "Test1234");
        } catch (SQLException e) {
            System.out.println("データベースへの接続に失敗しました。");
            e.printStackTrace();
        }
        return con;
    }
}
