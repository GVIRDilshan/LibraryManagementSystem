package lk.ijse.library.model;

import java.sql.*;
import java.util.ArrayList;

public class BookModel {

//    public static ArrayList<String> loadAllBookIds() {
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//
//            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/library",
//                    "root", "1234");
//
//            PreparedStatement stm = connection.prepareStatement("select bookId from book");
//
//            ResultSet result = stm.executeQuery();
//
//            ArrayList<String> BookIds = new ArrayList<>();
//
//            while (result.next()) {
//                BookIds.add(result.getString(1));
//            }
//            return BookIds;
//
//        } catch (ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//    }
}
