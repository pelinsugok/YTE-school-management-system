package tubitak_yte.student_management_system.security.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import tubitak_yte.student_management_system.security.entity.CustomUser;

import java.util.Optional;

public interface UserRepository extends JpaRepository<CustomUser, Long> {
    Optional<CustomUser> findByUsername(String username);

}