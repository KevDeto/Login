package login.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

	@PostMapping("login")
	public String login() {
		return "login completado";
	}
	
	@PostMapping("register")
	public String register() {
		return "registro completado";
	}
}
