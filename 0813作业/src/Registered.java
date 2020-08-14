import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Registered {
    public static void main(String[] args) throws SQLException {
        Connection conn = JdbcUtils.getConnection();
        String sql="insert into user(loginname,username,password,sex,identityCode,email,mobile,type)values(?,?,?,?,?,?,?,?)";
        PreparedStatement pstm=conn.prepareStatement(sql);
        pstm.setString(1,"aaa");
        pstm.setString(2,"大辉哥");
        pstm.setString(3,"123456");
        pstm.setString(4,"1");
        pstm.setString(5,"142724199806280111");
        pstm.setString(6,"356070886@qq.com");
        pstm.setString(7,"18235913333");
        pstm.setInt(8,0);
        pstm.executeUpdate();
        JdbcUtils.closeConnection(conn,pstm);
    }
}
