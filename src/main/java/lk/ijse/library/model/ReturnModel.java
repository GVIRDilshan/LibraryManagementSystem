//package lk.ijse.library.model;
//
//import lk.ijse.library.db.DBConnection;
//import lk.ijse.library.dto.Return;
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.SQLException;
//
//public class ReturnModel {
//
//    public static boolean ReturnSet(Return returns,String Qty,String BookId,String IssuseID) throws SQLException {
//
//        Connection con = DBConnection.getInstance().getConnection();
//        String sql = "insert into returnse values(?,?,?,?,?)";
//
//        PreparedStatement stm = con.prepareStatement(sql);
//
//        con.setAutoCommit(true);
//
//        stm.setObject(1,returns.getReturnId());
//        stm.setObject(2,returns.getReturnDate());
//        stm.setObject(3,returns.getIssuseId());
//        stm.setObject(4,returns.getIssuseDate());
//        stm.setObject(5,returns.getBookId());
//
//        int TakeIt = stm.executeUpdate();
//
//        return false;
//    }
//
//
//}
