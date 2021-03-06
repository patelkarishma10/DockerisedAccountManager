package com.bae.util;

import java.util.Optional;

import org.springframework.stereotype.Component;

import com.bae.entity.User;

@Component
public class Constants {

	public static final User MOCK_USER_OBJECT = new User(1, "user1", "user1", "£50", "123456");
	public static final User MOCK_USER_OBJECT2 = new User(2, "user2", "user2", "£500", "123456");
	public static final Optional<User> MOCK_USER_OBJECT3 = Optional.of(MOCK_USER_OBJECT);
}
