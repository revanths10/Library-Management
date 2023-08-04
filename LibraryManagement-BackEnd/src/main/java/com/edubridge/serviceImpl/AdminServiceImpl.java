package com.edubridge.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edubridge.entity.Admin;
import com.edubridge.repository.AdminRepository;
import com.edubridge.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminRepository adminRepository;

	@Override
	public Admin saveAdmin(Admin admin) 
	{
		return adminRepository.save(admin);
	}

	@Override
	public List<Admin> loginAdmin(Admin admin) 
	{
		return this.adminRepository.findByAmailAndApassword(admin.getAmail(),admin.getApassword());
	}

	@Override
	public List<Admin> getAdmins() 
	{
		return adminRepository.findAll();
	}

	@Override
	public List<Admin> getAdminById(long id) 
	{
		return adminRepository.findById(id);
	}

}
