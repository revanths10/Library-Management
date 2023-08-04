package com.edubridge.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edubridge.entity.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin,Long>
{
	public List<Admin> findByAmailAndApassword(String amail, String apassword);	
	public List<Admin> findById(long id);
}