package org.hocviencntt.repository;

import org.hocviencntt.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>{

	User findByUsername(String username);
}
