package it.vscalcione.springboot.demoapplicationjwt.repositories;

import it.vscalcione.springboot.demoapplicationjwt.ERole;
import it.vscalcione.springboot.demoapplicationjwt.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByRoleName(ERole roleName);
}
