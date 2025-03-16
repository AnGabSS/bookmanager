package com.tech.padawan.bookmanager.usermanagement.infra.persistence;

import com.tech.padawan.bookmanager.usermanagement.domain.model.user.User;
import com.tech.padawan.bookmanager.usermanagement.domain.repository.UserRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserInfraRepository extends JpaRepository<User, Long>, UserRepository {
}
