package lk.ijse.library.model;

import lk.ijse.library.dto.Publisher;
import lk.ijse.library.dto.Supplier;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SupplierModel {
    public static boolean SupplierAdd(Supplier supplier) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Library",
                    "root", "1234");

            PreparedStatement stm = connection.prepareStatement("insert into supplier values(?,?,?,?,?)");

            stm.setObject(1,supplier.getSupplierID());
            stm.setObject(2,supplier.getSupplierName());
            stm.setObject(3,supplier.getSupplierContact());
            stm.setObject(4,supplier.getSupplierAddress());
            stm.setObject(5,supplier.getBookID());

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
