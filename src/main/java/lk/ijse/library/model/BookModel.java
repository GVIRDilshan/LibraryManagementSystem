package lk.ijse.library.model;

import lk.ijse.library.db.DBConnection;
import lk.ijse.library.dto.Book;
import lk.ijse.library.dto.Member;

import java.sql.*;
import java.util.ArrayList;

public class BookModel {

        public static boolean BookAdd(Book book) throws SQLException {
            Connection con = DBConnection.getInstance().getConnection();
            String sql = "insert into book values(?,?,?,?,?,?)";

            PreparedStatement stm = con.prepareStatement(sql);


//            stm.setObject(1, member.getId());
//            stm.setObject(2,member.getName());
//            stm.setObject(3,member.getAddress());
//            stm.setObject(5,member.getAge());
//            stm.setObject(4,member.getContact());
//            stm.setObject(6,member.getEmail());
//            stm.setObject(7,member.getGender());

            return stm.executeUpdate() > 0;
        }
}
