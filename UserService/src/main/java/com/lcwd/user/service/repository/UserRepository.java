package com.lcwd.user.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lcwd.user.service.UserService.entities.User;
@Repository
public interface UserRepository extends JpaRepository<User, String> {

	/// if you want to implement any custom method or query
}
