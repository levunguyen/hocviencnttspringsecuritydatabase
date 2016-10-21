package org.hocviencntt.service;

import org.hocviencntt.model.User;

public interface UserService {

	void save(User user);

	User findByUsername(String username);

}
