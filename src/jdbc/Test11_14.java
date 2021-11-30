package jdbc;

import java.sql.*;

public class Test11_14 {

    public static void main(String[] args) {
        String sql1 = "INSERT INTO department VALUES (6, 'Etc1', 'Niigata', '094-555-xxxx')";
        String sql2 = "INSERT INTO department VALUES (5, 'Etc2', 'Yamanashi', '095-888-xxxx')";

        try(Connection con = UserDatabase.getConnect()) {
            try(Statement stmt = con.createStatement()) {
                con.setAutoCommit(false);
                stmt.executeUpdate(sql1);
                stmt.executeUpdate(sql2);
                con.commit();
            } catch (SQLException e) {
                if(con != null) {
                    con.rollback();
                    System.out.println("rollback");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
