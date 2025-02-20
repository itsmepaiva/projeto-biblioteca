package com.tibs.biblioteca.repository;

import com.tibs.biblioteca.domain.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Long> {
}
