//package com.jsp.ecommerce.controller;
//
////import org.springframework.security.access.prepost.PreAuthorize;
////import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.jsp.ecommerce.service.AuthService;
//
//@RestController
//@RequestMapping("/auth")
//public class AuthController {
//	

	//==========================================
	
//	@GetMapping("/check")
//	@PreAuthorize("hasRole('ADMIN')")
//	public String check() {
//		return "Checked and Working !!!";
//	}
//
//	@GetMapping("/test")
//	@PreAuthorize("hasRole('USER')")
//	public String test() {
//		return "Tested and Working !!!";
//	}

package com.jsp.ecommerce.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.ecommerce.dto.LoginDto;
import com.jsp.ecommerce.service.AuthService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

	private final AuthService authService;

	@PostMapping("/login")
	public Map<String, Object> login(@RequestBody LoginDto loginDto) {
		return authService.login(loginDto);
	}

}