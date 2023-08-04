package com.edubridge.service;

import java.util.List;

import com.edubridge.entity.Member;

public interface MemberService 
{
	Member saveMember(Member member);
	Member loginMember(Member member);
	Member updateMember(Member member,long id);
	Member getMemberById(long id);
	List<Member> getAllMember();
	void deleteMember(long id);

}

