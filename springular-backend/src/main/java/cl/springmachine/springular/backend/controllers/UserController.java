package cl.springmachine.springular.backend.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.springmachine.springular.backend.entities.User;
import cl.springmachine.springular.backend.repositories.UserRepository;

@RestController
@RequestMapping("/users")
public class UserController {

	private final UserRepository userRepository;

	public UserController(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@PostMapping
	User createUser(@RequestBody User user) {
		return userRepository.save(user);
	}

	@GetMapping("/{email}")
	User findUserByEmail(@PathVariable String email) {
		return userRepository.findByEmail(email);
	}

}
