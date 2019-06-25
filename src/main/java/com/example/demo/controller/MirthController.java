package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Mirth;
import com.example.demo.repository.MirthRepository;

@RestController
@RequestMapping("/mirth")
public class MirthController {
	
	@Autowired
	MirthRepository repo;

	@PostMapping("/patient")
	public Object savePatient(@RequestBody Mirth mirth)
	{
		return (mirth.getPatientId().length()==0||mirth.getPatientId().trim().length()==0||mirth.getPatientName().length()==0||
				mirth.getPatientName().trim().length()==0)?new String("Enter Proper Data"):repo.save(mirth);
	}
}
