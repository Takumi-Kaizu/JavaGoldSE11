package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test11_6 {

    public static void main(String[] args) {
        String sql = "SELECT no FROM department WHERE dept_name = 'Engineering'";
        try(Connection con = UserDatabase.getConnect();
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery(sql);){
            while(rs.next()) {
                System.out.print(rs.getString(3));
            }
        }catch(SQLException e) {
            System.out.print("SQLException");
            e.printStackTrace();
        }
    }
}
