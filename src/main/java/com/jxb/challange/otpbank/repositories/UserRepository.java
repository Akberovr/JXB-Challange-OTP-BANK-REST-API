package com.jxb.challange.otpbank.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.jxb.challange.otpbank.entity.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Integer> {

    Optional<User> findByUserName(String userName);

}
