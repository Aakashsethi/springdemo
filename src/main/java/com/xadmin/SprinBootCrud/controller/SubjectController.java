package com.xadmin.SprinBootCrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.xadmin.SprinBootCrud.bean.Subject;
import com.xadmin.SprinBootCrud.service.SubjectService;

@RestController
public class SubjectController {
	@Autowired
	private SubjectService subjectService;
	
	@RequestMapping("/subjects")
	public List<Subject> getAllSubjects(){
		return	subjectService.getAllSubjects();
	}
	//create a new record in the DB
	@RequestMapping(method = RequestMethod.POST, value="/subjects")
	public void addSubject(@RequestBody Subject subject) {
		subjectService.addSubject(subject);
	}
	
	//Update a new record in the DB
	@RequestMapping(method = RequestMethod.PUT, value="/subjects/{id}")
	public void updateSubject(@PathVariable String id ,@RequestBody Subject subject) {
		subjectService.updateSubject(id,subject);
	}
	//Delete a new record in the DB
	public void deleteSubject(@PathVariable String id ) {
		subjectService.deleteSubject(id);
	}
	
	
}
