package com.codeup.marco.adlister.daos;

import com.codeup.marco.adlister.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<User, Long> {
}
