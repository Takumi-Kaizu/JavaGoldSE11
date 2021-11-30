package practice_exam_jtp_2;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// --- 注意 Attention ---
// 答えは B Test3 となっているが、getString()メソッドは 0 が最初のカラムではなく、
// 1 が最初のカラム指定である。
// そのため、サンプルコードを実行すると厳密には 103 (1つ目のカラム) が返ってくる。
// よって、模擬試験 No.13 の選択肢には解答が存在しない。

public class Tetst13 {
    public static void main(String[] args) {
        String sql = "SELECT * FROM department";
        try(Connection con = UserDatabase.getConnect();
                Statement stmt = con.createStatement(
                        ResultSet.TYPE_SCROLL_INSENSITIVE,
                        ResultSet.CONCUR_READ_ONLY);
                ResultSet rs = stmt.executeQuery(sql)) {
            rs.relative(5);
            rs.relative(0);
            rs.relative(0);
            rs.relative(0);
            System.out.println(rs.getString(2));
        } catch (SQLException e) {
            System.out.print("SQLException");
        }
    }
}
