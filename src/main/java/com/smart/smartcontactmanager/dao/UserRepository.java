package com.smart.smartcontactmanager.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smart.smartcontactmanager.entities.User;

public interface UserRepository extends JpaRepository<User,Integer>{
    
}
