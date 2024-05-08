package com.semana.projetoweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.semana.projetoweb.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}

