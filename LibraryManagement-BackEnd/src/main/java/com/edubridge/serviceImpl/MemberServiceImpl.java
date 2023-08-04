package com.edubridge.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edubridge.entity.Member;
import com.edubridge.repository.MemberRepository;
import com.edubridge.service.MemberService;

@Service
public class MemberServiceImpl implements MemberService
{
	@Autowired
	private MemberRepository memberRepository;
		

	public MemberServiceImpl(MemberRepository memberRepository) 
	{
		super();
		this.memberRepository = memberRepository;
	}


	@Override
	public Member saveMember(Member member) 
	{
		return memberRepository.save(member);
	}


	@Override
	public Member loginMember(Member member) 
	{
		return this.memberRepository.findByUmailAndUpassword(member.getUmail(), member.getUpassword()).orElseThrow();
	}


	@Override
	public Member updateMember(Member member, long id) 
	{
		Member existingMember = memberRepository.findById(id).orElseThrow();
		existingMember.setUadmid(member.getUadmid());
		existingMember.setUdep(member.getUdep());
		existingMember.setUmail(member.getUmail());
		existingMember.setUname(member.getUname());
		existingMember.setUpassword(member.getUpassword());
		existingMember.setUrecj(member.getUrecj());
		existingMember.setUrecstatus(member.getUrecstatus());
		existingMember.setUreqj(member.getUreqj());
		existingMember.setUstatus(member.getUstatus());
		memberRepository.save(existingMember);
		return existingMember;
	}


	@Override
	public Member getMemberById(long id) 
	{
		return this.memberRepository.findById(id).orElseThrow();
	}


	@Override
	public List<Member> getAllMember() 
	{
		return memberRepository.findAll();
	}


	@Override
	public void deleteMember(long id) 
	{
		memberRepository.findById(id).orElseThrow();
		memberRepository.deleteById(id);
	}

}
