package login.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import login.model.dto.LoginRequest;
import login.model.dto.RegisterRequest;
import login.model.payload.AuthResponse;
import login.service.AuthService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {
	
	private final AuthService authService;

	@PostMapping("login")
	public ResponseEntity<AuthResponse> login(@RequestBody LoginRequest loginRequest) {
		return ResponseEntity.ok(authService.login(loginRequest));
	}
	
	//la base de datos descarta un usuario duplicado y pasa al siguiente ID (es normal?)
	@PostMapping("register")
	public ResponseEntity<AuthResponse> register(@RequestBody RegisterRequest registerRequest) {
		return ResponseEntity.ok(authService.register(registerRequest));
	}
}
