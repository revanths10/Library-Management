package com.edubridge.service;

import java.util.List;

import com.edubridge.entity.Admin;

public interface AdminService {
	
	Admin saveAdmin(Admin admin);
	List<Admin> loginAdmin(Admin admin);
	List<Admin> getAdmins();
	List<Admin> getAdminById(long id);

}
