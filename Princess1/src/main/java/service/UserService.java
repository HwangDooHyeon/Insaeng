package service;

import domain.User;
import dto.UserDto;
import repository.UserRepository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class UserService {

    private UserRepository userRepository = null;

    public UserService() {
        userRepository = new UserRepository();
        userRepository.createTable();
    }

    public void getInstance(){
        UserDto userDto = new UserDto();
    }

    public void save(UserDto userDto) {
        userRepository.save(userDto.toEntity());
    }


    public User findById(Long id) {
        return userRepository.findById(id);
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public void deleteUser(Long id) {
        userRepository.deleteUser(id);
    }
}
