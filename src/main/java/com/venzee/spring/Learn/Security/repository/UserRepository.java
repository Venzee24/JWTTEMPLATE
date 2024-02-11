package com.venzee.spring.Learn.Security.repository;

import com.venzee.spring.Learn.Security.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
}
