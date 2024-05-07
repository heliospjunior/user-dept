package com.heliopaivajunior.userdept.repositories;

import com.heliopaivajunior.userdept.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
