package DAO;

import Controller.SceneController;
import DTO.UserDTO;
import User.User;

import java.sql.*;
import java.util.*;

// DB 접근
public class SceneDAOImplement implements SceneDAO {

    private Connection connection = null;

    public SceneDAOImplement() {
        try {
            Class.forName("org.h2.Driver");
            connection = DriverManager.getConnection(
                    "jdbc:h2:mem:test",
                    "sa",
                    "");
        } catch (Exception e) {
            e.getMessage();
        }
    }

    // -------------- <Create> --------------------------------
    @Override
    public void createTable() {
        String tableSQL = "CREATE TABLE IF NOT EXISTS User (" +
                "id INT AUTO_INCREMENT PRIMARY KEY," +
                "Intel VARCHAR(255) NOT NULL, " +
                "Wealth VARCHAR(255) NOT NULL, " +
                "Sociability VARCHAR(255) NOT NULL, " +
                "Morality VARCHAR(255) NOT NULL, " +
                "Artistry VARCHAR(255) NOT NULL, " +
                "PTSD VARCHAR(255) NOT NULL)";
        try {
            PreparedStatement statement = connection.prepareStatement(tableSQL);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void create(User user) {
        try {
            String insertSQL = "INSERT INTO User (Intel, Wealth, Sociability, Morality, Artistry, PTSD) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement insertStatement = connection.prepareStatement(insertSQL);

            insertStatement.setInt(1, user.getIntel());
            insertStatement.setInt(2, user.getWealth());
            insertStatement.setInt(3, user.getSociability());
            insertStatement.setInt(4, user.getMorality());
            insertStatement.setInt(5, user.getArtistry());
            insertStatement.setInt(6, user.getPTSD());

            insertStatement.execute();
            insertStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updateuser(User user) {
        try {
            String updateSQL = "UPDATE User SET  Intel = ?, Wealth = ?, Sociability = ?, Morality = ?, Artistry = ?, PTSD = ? WHERE id = ?";
            PreparedStatement updateStatement = connection.prepareStatement(updateSQL);
            updateStatement.setInt(1, user.getIntel());
            updateStatement.setInt(2, user.getWealth());
            updateStatement.setInt(3, user.getSociability());
            updateStatement.setInt(4, user.getMorality());
            updateStatement.setInt(5, user.getArtistry());
            updateStatement.setInt(6, user.getPTSD());
            updateStatement.setLong(7, user.getID());


            updateStatement.executeUpdate();
            updateStatement.close();

        } catch (SQLException e) {
            e.getMessage();
        }

    }

    @Override
    public List<User> findAll() {
        String selectSQL = "SELECT * FROM User";

        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(selectSQL);

            List<User> users = new ArrayList<>();

            while (resultSet.next()) {
                users.add(
                        new User(
                                resultSet.getLong("id"),
                                resultSet.getInt("Intel"),
                                resultSet.getInt("Wealth"),
                                resultSet.getInt("Sociability"),
                                resultSet.getInt("Morality"),
                                resultSet.getInt("Artistry"),
                                resultSet.getInt("PTSD"))
                );
            }

            resultSet.close();

            return users;

        } catch (SQLException e) {
            e.printStackTrace();
            return Collections.emptyList();
        }
    }
}