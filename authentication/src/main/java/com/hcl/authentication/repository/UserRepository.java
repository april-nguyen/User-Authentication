package com.hcl.authentication.repository;

import com.hcl.authentication.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
  boolean existsByUsernameAndPassword(String username, String password);
}
