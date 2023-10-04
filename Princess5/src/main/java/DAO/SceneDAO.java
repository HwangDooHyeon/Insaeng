package DAO;

import DTO.UserDTO;
import User.User;

import java.sql.SQLException;
import java.util.List;

public interface SceneDAO {
    public void createTable();
    public void create(User user);
    public void updateuser(User user);
    public List<User> findAll();

}


