package jdbc;

import java.sql.*;

public class Test11_7 {

    public static void main(String[] args) {
        try(Connection con = UserDatabase.getConnect();
                Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
                ) {
            ResultSet rs = stmt.executeQuery("SELECT * FROM department");
            while(rs.next()) {
                if(rs.getInt(1) == 2) {
                    // updateString()...リザルトセットの値を更新する。
                    // updateRow()   ...updateString() で更新した値(リザルトセット)をデータベースに反映する。
                    rs.updateString(3, "Niigata");
                    rs.updateRow();
                }
            }
            // absolute()...指定した行にカーソルを移動させる。
            rs.absolute(2);
            System.out.println(rs.getString(2) + " : " + rs.getString(3));
        }catch(SQLException e) {
            System.out.print("SQLException");
            e.printStackTrace();
        }
    }
}
