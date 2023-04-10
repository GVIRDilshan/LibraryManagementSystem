package lk.ijse.library.model;

import lk.ijse.library.db.DBConnection;
import lk.ijse.library.dto.Member;
import lk.ijse.library.dto.Publisher;

import java.sql.*;
import java.time.LocalDate;

public class PublisherModel {
    public static boolean PublisherAdd(Publisher publisher) throws SQLException {

        Connection con = DBConnection.getInstance().getConnection();
        String sql = "insert into publisher values(?,?,?,?)";

        PreparedStatement stm = con.prepareStatement(sql);


        stm.setObject(1,publisher.getPublisherID());
        stm.setObject(2,publisher.getPublisherName());
        stm.setObject(3,publisher.getBookID());
        stm.setObject(4,publisher.getPublishDate());

        return stm.executeUpdate() > 0;
    }
    public static Publisher searchFrom(String id) throws SQLException {

        Connection con = DBConnection.getInstance().getConnection();
        String sql = "select * from publisher where pbId=?";

        PreparedStatement stm = con.prepareStatement(sql);
        stm.setObject(1,id);

        ResultSet result = stm.executeQuery();

        if (result.next()) {
            Publisher publisher = new Publisher();
            publisher.setPublisherID(result.getString(1));
            publisher.setPublisherName(result.getString(2));
            publisher.setBookID(result.getString(3));
            publisher.setPublishDate(String.valueOf(LocalDate.now()));

        }
        return null;
    }
    public static Boolean updatePublisher(Publisher publisher) throws SQLException {
        Connection con = DBConnection.getInstance().getConnection();
        String sql = "update publisher set name=?,Book_Id=?,pdDate=? where pbId=?";

        PreparedStatement stm = con.prepareStatement(sql);

//        stm.setObject(1, member.getName());
//        stm.setObject(2, member.getAddress());
//        stm.setObject(3, member.getContact());
//        stm.setObject(4, member.getAge());
//        stm.setObject(5,member.getEmail());
//        stm.setObject(6,member.getGender());
//        stm.setObject(7, member.getId());


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
