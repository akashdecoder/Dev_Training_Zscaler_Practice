package com.example.railways.repository;

import com.example.railways.models.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserDetails, Long> {
    @Query(value = "SELECT a FROM UserDetails a WHERE a.uId=?1")
    UserDetails fetchById(int id);

    @Query(value = "SELECT * FROM users a WHERE a.u_email_id=?1", nativeQuery = true)
    UserDetails fetchByEmail(String emailId);
}
