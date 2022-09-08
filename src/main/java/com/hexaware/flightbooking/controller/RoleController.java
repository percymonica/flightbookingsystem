package com.hexaware.flightbooking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.flightbooking.entity.Role;
import com.hexaware.flightbooking.service.IRoleService;

@RestController
@RequestMapping("/api/role")
public class RoleController {
	
	@Autowired
	private IRoleService roleService;
	
	@GetMapping("/getallroles")
	public List<Role> getAllRoles(){
		return roleService.getAllRoles();
	}

}
