package lk.ijse.library.model;

import lk.ijse.library.db.DBConnection;
import lk.ijse.library.dto.Autor;

import java.sql.*;
import java.util.ArrayList;

public class AutorModel {
    public static boolean AutorAdd(Autor Aotor) throws SQLException {
        Connection con = DBConnection.getInstance().getConnection();
        String sql = "insert into autor values(?,?,?,?)";

        PreparedStatement stm = con.prepareStatement(sql);

        stm.setObject(1,Aotor.getAutorID());
        stm.setObject(2,Aotor.getAutorName());
        stm.setObject(3,Aotor.getBookName());
        stm.setObject(4,Aotor.getBookID());

        int result = stm.executeUpdate();

        if (result > 0) {
            return true;
        } else {
            return false;
        }
    }
    public static ArrayList<String> loadAllAutorIds() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/library",
                    "root", "1234");

            PreparedStatement stm = connection.prepareStatement("select AutorId from Autor");

            ResultSet result = stm.executeQuery();

            ArrayList<String> AutorIds = new ArrayList<>();

            while (result.next()) {
               AutorIds.add(result.getString(1));
            }
            return AutorIds;

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
