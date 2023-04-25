package lk.ijse.library.model;

import lk.ijse.library.db.DBConnection;
import lk.ijse.library.dto.Donetion;
import lk.ijse.library.dto.Exibition;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ExibitionModel {
    public static boolean SaveExibition(Exibition exibition) throws SQLException {

        Connection con = DBConnection.getInstance().getConnection();
        String sql = "insert into exibitions values(?,?,?,?)";

        PreparedStatement stm = con.prepareStatement(sql);

        stm.setObject(1,exibition.getExibitionId());
        stm.setObject(2,exibition.getExibitionDate());
        stm.setObject(3,exibition.getExibitionTime());
        stm.setObject(4,exibition.getExibitionDesc());

        return stm.executeUpdate() > 0;
    }
    public static ArrayList<String> loadAllExibitionIds() throws SQLException {

        Connection con = DBConnection.getInstance().getConnection();

        String sql = "select ExibitionsId from exibitions";

        PreparedStatement stm = con.prepareStatement(sql);

        ResultSet result = stm.executeQuery();

        ArrayList<String> ExibitionIds = new ArrayList<>();

        while (result.next()) {
            ExibitionIds.add(result.getString(1));
        }
        return ExibitionIds;
    }
}
