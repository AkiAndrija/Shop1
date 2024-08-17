package dao;

import model.Sale;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SaleDAO {
    private Connection connection;

    public SaleDAO() throws SQLException {
        DatabaseMetaData DBUtil = null;
        connection = DBUtil.getConnection();
    }

    public void addSale(Sale sale) {
        try {
            String query = "INSERT INTO sales (product_id, buyer_id, price) VALUES (?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, sale.getProductId());
            preparedStatement.setInt(2, sale.getBuyerId());
            preparedStatement.setDouble(3, sale.getPrice());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
