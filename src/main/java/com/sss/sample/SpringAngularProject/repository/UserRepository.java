package com.sss.sample.SpringAngularProject.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sss.sample.SpringAngularProject.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	void delete(User user);

	List<User> findAll();

	User findById(int id);
	
	User save(User user);
}
