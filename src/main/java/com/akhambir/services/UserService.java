package com.akhambir.services;

import com.akhambir.model.User;

public interface UserService {

    User addUser(User user);

    User findById(Long id);

}
