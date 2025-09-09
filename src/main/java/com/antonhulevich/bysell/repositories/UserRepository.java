package com.antonhulevich.bysell.repositories;

import com.antonhulevich.bysell.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    User findByEmail(String email);
}
