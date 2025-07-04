package com.loanxiiu.identityservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.loanxiiu.identityservice.entity.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, String> {}
