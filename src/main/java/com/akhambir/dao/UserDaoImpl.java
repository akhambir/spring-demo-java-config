package com.akhambir.dao;

import com.akhambir.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public User addUser(User user) {
        String sql = "INSERT INTO USERS " +
                "(ID, EMAIL, PASSWORD, FIRST_NAME, LAST_NAME, REGISTER_DATE)" +
                " VALUES (?, ?, ?, ?, ?, ?)";
        jdbcTemplate.update(sql,
                user.getId(),
                user.getEmail(),
                user.getPassword(),
                user.getFirstName(),
                user.getLastName(),
                user.getRegisterDate());
        return user;
    }
}
