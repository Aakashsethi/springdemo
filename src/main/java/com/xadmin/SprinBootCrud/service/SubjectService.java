package com.xadmin.SprinBootCrud.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xadmin.SprinBootCrud.bean.Subject;
import com.xadmin.SprinBootCrud.repository.SubjectRepository;


@Service
public class SubjectService {
	@Autowired
	//call the repository class for spring JPA
	public SubjectRepository subjectRepo;
	
	public List<Subject> getAllSubjects(){
		List<Subject> subjects = new ArrayList<>();
		subjectRepo.findAll().forEach(subjects::add);
		return subjects;
	}

	public void addSubject(Subject subject) {
		// TODO Auto-generated method stub
		subjectRepo.save(subject);
	}
	

}
