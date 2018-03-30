package io.agrits.guestList.repositories;

import io.agrits.guestList.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface UserRepository extends JpaRepository<User, Long>{
    Optional<User> findOneById(Long id);
    Optional<User> findOneByUsername(String username);
}
