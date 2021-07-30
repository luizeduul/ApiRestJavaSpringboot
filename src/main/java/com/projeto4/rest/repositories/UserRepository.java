package com.projeto4.rest.repositories;

import com.projeto4.rest.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
