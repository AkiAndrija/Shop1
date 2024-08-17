package dao;

import model.Buyer;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BuyerDAO {
    private Connection connection;

    public BuyerDAO() throws SQLException {
        Statement DBUtil = null;
        connection = DBUtil.getConnection();
    }

    public void addBuyer(Buyer buyer) {
        try {
            String query = "INSERT INTO buyers (name, email) VALUES (?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, buyer.getName());
            preparedStatement.setString(2, buyer.getEmail());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteBuyer(int buyerId) {
        try {
            String query = "DELETE FROM buyers WHERE id=?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, buyerId);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateBuyer(Buyer buyer) {
        try {
            String query = "UPDATE buyers SET name=?, email=? WHERE id=?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, buyer.getName());
            preparedStatement.setString(2, buyer.getEmail());
            preparedStatement.setInt(3, buyer.getId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Buyer> getAllBuyers() {
        List<Buyer> buyers = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM buyers");
            while (rs.next()) {
                Buyer buyer = new Buyer();
                buyer.setId(rs.getInt("id"));
                buyer.setName(rs.getString("name"));
                buyer.setEmail(rs.getString("email"));
                buyers.add(buyer);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return buyers;
    }
}