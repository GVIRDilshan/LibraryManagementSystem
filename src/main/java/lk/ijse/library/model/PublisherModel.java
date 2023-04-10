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
}
