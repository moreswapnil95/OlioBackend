package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import entity.UserForm;
import service.UserFormService;

@CrossOrigin
@RequestMapping("/user")
@RestController
public class UserFormController {
	
	@Autowired
	UserFormService userFormService;
	
	@PostMapping("/register")
	public ResponseEntity<String> register(@RequestBody UserForm userform){
		
		UserForm saveForm = userFormService.saveRegistration(userform);
		if(saveForm != null) {
			return ResponseEntity.ok("Registration successful");
		}
		else {
			return ResponseEntity.badRequest().body("Registration failed");
		}
		
	}
	
	@GetMapping("/all")
	public List<UserForm> getAll() {
		return userFormService.getAll();
	}

}
