import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class FindProduct {
    public static void main(String[] args) throws SQLException {
        Connection conn=JdbcUtils.getConnection();
//        String sql="select *from product";
//        PreparedStatement pstm=conn.prepareStatement(sql);
//        ResultSet rs=pstm.executeQuery();
//        List<Product> products=new ArrayList<>();
//        while (rs.next()){
//            Product product=new Product();
//            product.setId(rs.getInt(1));
//            product.setName(rs.getString(2));
//            product.setDesc(rs.getString(3));
//            product.setPrice(rs.getInt(4));
//            product.setStock(rs.getInt(5));
//            product.setLv1(rs.getInt(6));
//            product.setLv2(rs.getInt(7));
//            product.setLv3(rs.getInt(8));
//            product.setFilename(rs.getString(9));
//            product.setIsDelete(rs.getInt(10));
//            products.add(product);
//        }
//        for (Product product : products) {
//            System.out.println(product);
//        }
//        JdbcUtils.closeConnection(conn,pstm);


        String sql="select * from product where id=?";
        PreparedStatement pstm=conn.prepareStatement(sql);
        pstm.setInt(1,746);
        ResultSet rs=pstm.executeQuery();
        List<Product> products=new ArrayList<>();
        while (rs.next()){
            Product product=new Product();
            product.setId(rs.getInt(1));
            product.setName(rs.getString(2));
            product.setDesc(rs.getString(3));
            product.setPrice(rs.getInt(4));
            product.setStock(rs.getInt(5));
            product.setLv1(rs.getInt(6));
            product.setLv2(rs.getInt(7));
            product.setLv3(rs.getInt(8));
            product.setFilename(rs.getString(9));
            product.setIsDelete(rs.getInt(10));
            products.add(product);
            System.out.println(products);
        }
    }
}
