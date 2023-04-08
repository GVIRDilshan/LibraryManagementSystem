package lk.ijse.library.model;

import lk.ijse.library.db.DBConnection;
import lk.ijse.library.dto.Member;

import java.sql.*;

public class MemberModel {

    public static boolean memberAdd(Member member) throws SQLException {
        Connection con = DBConnection.getInstance().getConnection();
        String sql = "insert into Member values(?,?,?,?,?,?,?)";

        PreparedStatement stm = con.prepareStatement(sql);

            stm.setObject(1, member.getId());
            stm.setObject(2,member.getName());
            stm.setObject(3,member.getAddress());
            stm.setObject(5,member.getAge());
            stm.setObject(4,member.getContact());
            stm.setObject(6,member.getEmail());
            stm.setObject(7,member.getGender());

        return stm.executeUpdate() > 0;
    }
    public static Member searchFrom(String id) throws SQLException {
        Connection con = DBConnection.getInstance().getConnection();
        String sql = "select * from member where memberId=?";

        PreparedStatement stm = con.prepareStatement(sql);
        stm.setObject(1,id);

        ResultSet result = stm.executeQuery();

        if (result.next()) {
            Member member = new Member();
            member.setId(result.getString(1));
            member.setName(result.getString(2));
            member.setAddress(result.getString(3));
            member.setContact(result.getString(4));
            member.setAge(Integer.parseInt(result.getString(5)));
            member.setEmail(result.getString(6));
            member.setGender(result.getString(7));
            return member;
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
}
