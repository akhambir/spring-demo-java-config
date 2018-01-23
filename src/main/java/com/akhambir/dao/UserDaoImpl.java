package com.akhambir.dao;

import com.akhambir.model.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class UserDaoImpl implements UserDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public User addUser(User user) {
        return (User) sessionFactory.getCurrentSession().save(user);
    }

    /*@Autowired
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
    }*/
}
