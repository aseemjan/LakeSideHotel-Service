package com.aseem.lakesidehotel.repository;

import com.aseem.lakesidehotel.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    static boolean existsByName(String roleName) {
    }

    Optional<Role> findByName(String role);
}
