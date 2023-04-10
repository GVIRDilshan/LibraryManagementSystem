package lk.ijse.library.model;

import lk.ijse.library.db.DBConnection;
import lk.ijse.library.dto.Member;
import lk.ijse.library.dto.Publisher;
import lk.ijse.library.dto.Supplier;

import java.sql.*;

public class SupplierModel {

    public static boolean SupplierAdd(Supplier supplier) throws SQLException {
        Connection con = DBConnection.getInstance().getConnection();
        String sql = "insert into supplier values(?,?,?,?,?)";

        PreparedStatement stm = con.prepareStatement(sql);

        stm.setObject(1,supplier.getSupplierID());
        stm.setObject(2,supplier.getSupplierName());
        stm.setObject(3,supplier.getSupplierContact());
        stm.setObject(4,supplier.getSupplierAddress());
        stm.setObject(5,supplier.getBookID());

        return stm.executeUpdate() > 0;
    }
    public static Supplier searchFrom(String id) throws SQLException {
        Connection con = DBConnection.getInstance().getConnection();
        String sql = "select * from supplier where  SupplierId=?";

        PreparedStatement stm = con.prepareStatement(sql);
        stm.setObject(1,id);

        ResultSet result = stm.executeQuery();

        if (result.next()) {
           Supplier supplier = new Supplier();
           supplier.setSupplierID(result.getString(1));
           supplier.setSupplierName(result.getString(2));
           supplier.setSupplierAddress(result.getString(3));
           supplier.setSupplierContact(result.getString(4));
           supplier.setBookID(result.getString(5));
            return supplier;
        }
        return null;
    }
    public static Boolean updateMember(Member member) throws SQLException {
        Connection con = DBConnection.getInstance().getConnection();
        String sql = "update member set name=?,address=?,contact=?,age=?,email=?,Gender=? where memberId=?";

        PreparedStatement stm = con.prepareStatement(sql);

        stm.setObject(1, member.getName());
        stm.setObject(2, member.getAddress());
        stm.setObject(3, member.getContact());
        stm.setObject(4, member.getAge());
        stm.setObject(5,member.getEmail());
        stm.setObject(6,member.getGender());
        stm.setObject(7, member.getId());


        int result = stm.executeUpdate();

        if (result == 1) {
            return true;
        }
        return null;
    }
    public static boolean deleteFrom(String id) throws SQLException {
        Connection con = DBConnection.getInstance().getConnection();
        String sql = "delete from member where memberId =?";

        PreparedStatement stm = con.prepareStatement(sql);

        stm.setObject(1, id);

        int result = stm.executeUpdate();

        if (result > 0) {
            return true;
        } else {
            return false;
        }
    }
}
