package com.example.spring_rest_exam.repository;

import com.example.spring_rest_exam.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;



import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {
   Optional< User> findByEmail(String email);


}
