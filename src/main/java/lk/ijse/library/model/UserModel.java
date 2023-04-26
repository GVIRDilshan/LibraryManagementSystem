package lk.ijse.library.model;

import lk.ijse.library.db.DBConnection;
import lk.ijse.library.dto.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserModel {
    public static boolean updateUser(User user) throws SQLException {
        Connection con = DBConnection.getInstance().getConnection();
        PreparedStatement ps = con.prepareStatement("UPDATE user SET password = ? WHERE userName = ?");

        ps.setString(1 , user.getPassword());
        ps.setString(2 , user.getUserName());

        return ps.executeUpdate() > 0;

    }

}
