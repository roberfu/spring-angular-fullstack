package cl.springmachine.springular.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.springmachine.springular.backend.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);

}
