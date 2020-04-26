package com.stricbiz.flywayintegration.persistence.repository;

import com.stricbiz.flywayintegration.persistence.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {
}
