package com.hexaware.flightbooking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.flightbooking.entity.Role;
import com.hexaware.flightbooking.repository.RoleRepository;

@Service
public class RoleServiceImpl implements IRoleService{
	@Autowired
	private RoleRepository roleRepository;
	
	@Override
	public List<Role> getAllRoles() {
		return roleRepository.findAll();
	}

}
