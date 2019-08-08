package com.bae.logic;

import java.util.Collection;
import java.util.Optional;

import com.bae.entity.User;

public interface UserService {

	Optional<User> getAUser(long id);

	String deleteAUser(long id);

	Collection<User> getAllUsers();

	User createUser(User user);

}
