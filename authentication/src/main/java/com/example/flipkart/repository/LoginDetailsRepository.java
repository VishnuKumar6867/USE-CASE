package com.example.flipkart.repository;

import com.example.flipkart.entity.LoginDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginDetailsRepository extends JpaRepository<LoginDetails, Integer> {
    LoginDetails findByUserName(String username);
}
