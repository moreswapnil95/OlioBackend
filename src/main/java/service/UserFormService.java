package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entity.UserForm;
import repository.UserFormRepository;

@Service
public class UserFormService {
	
	@Autowired
	UserFormRepository userFormRepository;

	public UserForm saveRegistration(UserForm userform) {
		// TODO Auto-generated method stub
		return userFormRepository.save(userform);
	}

	public List<UserForm> getAll() {
		// TODO Auto-generated method stub
		return userFormRepository.findAll();
	}

}
