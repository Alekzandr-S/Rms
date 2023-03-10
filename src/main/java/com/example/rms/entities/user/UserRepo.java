package com.example.rms.entities.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {
    @Query("SELECT u  FROM User u WHERE u.userName = ?1")
    User findByUserName(String userName);
}
