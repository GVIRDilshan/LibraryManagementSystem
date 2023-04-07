package lk.ijse.library.model;

import lk.ijse.library.db.DBConnection;
import lk.ijse.library.dto.Member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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

}
