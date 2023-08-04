package com.edubridge.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edubridge.entity.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long>
{
	Optional<Member> findByUmailAndUpassword(String umail,String upassword);
	Optional<Member> findByUmail(String umail);
}

