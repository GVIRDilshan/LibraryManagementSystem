package lk.ijse.library.model;

import lk.ijse.library.dto.Member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MemberModel {

    public static boolean memberAddFrom(Member member) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Library",
                    "root", "1234");

            PreparedStatement stm = connection.prepareStatement("insert into Member values(?,?,?,?,?,?,?)");

            stm.setObject(1, member.getId());
            stm.setObject(2,member.getName());
            stm.setObject(3,member.getAddress());
            stm.setObject(5,member.getAge());
            stm.setObject(4,member.getContact());
            stm.setObject(6,member.getEmail());
            stm.setObject(7,member.getGender());

            int result = stm.executeUpdate();

            if (result > 0) {
                return true;
            } else {
                return false;
            }

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
