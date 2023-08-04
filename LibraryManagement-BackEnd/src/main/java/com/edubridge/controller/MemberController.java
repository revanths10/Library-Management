package com.edubridge.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edubridge.entity.Member;
import com.edubridge.service.MemberService;

@RestController
@CrossOrigin("*")
@RequestMapping("/members")
public class MemberController 
{	
	@Autowired
	private MemberService memberService;
	
	public MemberController(MemberService memberService) {
		super();
		this.memberService = memberService;
	}

	//Register Student
	@PostMapping()
	public ResponseEntity<Member> saveMember(@RequestBody Member member)
	{
		return new ResponseEntity<Member>(memberService.saveMember(member),HttpStatus.CREATED);
	}
	
	//Login
	@PostMapping("/login")
	public  ResponseEntity<Member> loginMember( @RequestBody Member member)
	{
		return new ResponseEntity<Member>(memberService.loginMember(member),HttpStatus.OK);	
	}
	
	//Update Student	
	@PutMapping("{id}")
	public ResponseEntity<Member> updateMember(@PathVariable("id") long id, @RequestBody Member member)
	{
		return new ResponseEntity<Member> (memberService.updateMember(member, id),HttpStatus.OK);
	}
	
	//Get All Customer	
	@GetMapping()
	public List<Member> getAllMember()
	{
		return memberService.getAllMember();
	}
	
	//get Student by id
	@GetMapping("{id}")
	public ResponseEntity<Member> getMemberById(@PathVariable("id") long id)
	{
		return new ResponseEntity<Member>(memberService.getMemberById(id),HttpStatus.OK);
	}
		
	//Delete Student	
	@DeleteMapping("{id}")
	public ResponseEntity<Boolean> deleteMember(@PathVariable("id") long id)
	{
		memberService.deleteMember(id);
		boolean flag=true;
		return new ResponseEntity<Boolean>(flag,HttpStatus.OK);
	}
}
