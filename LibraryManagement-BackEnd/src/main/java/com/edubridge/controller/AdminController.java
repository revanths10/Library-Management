package com.edubridge.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edubridge.entity.Admin;
import com.edubridge.service.AdminService;

@RestController
@CrossOrigin("*")
@RequestMapping("/admins")
public class AdminController {
	
	@Autowired
	private AdminService adminservice;

	public AdminController(AdminService adminservice) 
	{
		super();
		this.adminservice = adminservice;
	}
	
	//get all admin
	@GetMapping()
	public List<Admin> getAdmins()
	{
		return adminservice.getAdmins();
	}
	
	//get booking details by admin id
	@GetMapping("{id}")
	public List<Admin> getAdminById(@PathVariable("id") long id)
	{
		return adminservice.getAdminById(id);
	}
	
	//admin register
	@PostMapping("/save")
	public ResponseEntity<Admin> saveAdmin(@Validated @RequestBody  Admin admin)
	{
	System.out.println("admin register "+admin);
		return new ResponseEntity<Admin>(adminservice.saveAdmin(admin),HttpStatus.CREATED);
	}
	
	//admin login
	@PostMapping("/login")
	public List<Admin> loginAdmin( @RequestBody Admin admin)
	{
	return adminservice.loginAdmin(admin);
	}

}
