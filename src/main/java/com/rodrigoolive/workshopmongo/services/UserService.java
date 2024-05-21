package com.rodrigoolive.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rodrigoolive.workshopmongo.domain.User;
import com.rodrigoolive.workshopmongo.dto.UserDTO;
import com.rodrigoolive.workshopmongo.repository.UserRepository;
import com.rodrigoolive.workshopmongo.services.exception.ObjectNotFoundExcption;

@Service
public class UserService {
    
    @Autowired
    private UserRepository repo;
    
    public List<User> findAll() {
        return repo.findAll();
    }
    
    public User findById(String id) {
        Optional<User> user = repo.findById(id);
        return user.orElseThrow(() -> new ObjectNotFoundExcption("Object not found with id: " + id));
    }
    
    public User insert(User obj) {
    	return repo.insert(obj);
    }
    
    public void delete(String id) {
    	findById(id);
    	repo.deleteById(id);
    }
    
    public User update(User obj) {
    	Optional<User> optionalUser = repo.findById(obj.getId());
    	User newOBJ = optionalUser.orElseThrow(() -> new ObjectNotFoundExcption("User not found with id: " + obj.getId()));
    	updateData(newOBJ, obj);
    	return repo.save(newOBJ);
    }
    
    private void updateData(User newOBJ, User obj) {
		newOBJ.setName(obj.getName());
		newOBJ.setEmail(obj.getEmail());
		
	}

	public User fromDTO(UserDTO objDTO) {
    	return new User(objDTO.getId(), objDTO.getName(), objDTO.getEmail());
    }
}
