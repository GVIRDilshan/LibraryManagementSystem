package lk.ijse.library.model;

import lk.ijse.library.dto.Publisher;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PublisherModel {
    public static boolean PublisherAdd(Publisher publisher) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Library",
                    "root", "1234");

            PreparedStatement stm = connection.prepareStatement("insert into publisher values(?,?,?,?)");

            stm.setObject(1,publisher.getPublisherID());
            stm.setObject(2,publisher.getPublisherName());
            stm.setObject(3,publisher.getBookID());
            stm.setObject(4,publisher.getPublishDate());

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
