package com.springsystems.app.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springsystems.app.entity.College;
import com.springsystems.app.repository.CollegeRepository;

@RestController
@RequestMapping("/college")
public class CollegeController {
	@Autowired
	CollegeRepository collegeRepository;
	private Optional<College> clgOptional;

	@PostMapping("/save")
	public String saveCollege(@RequestBody College college) {
		collegeRepository.save(college);
		return "College data saved successfully";
	}

	@GetMapping("/get")
	public ResponseEntity<List<College>> getCollege() {
		List<College> collegeList = new ArrayList<College>();
		collegeRepository.findAll().forEach(collegeList::add);
		return new ResponseEntity<List<College>>(collegeList, HttpStatus.OK);
	}
	
	@PutMapping("/put{id}")
	public String updateCollegeById(@PathVariable("id") long id, @RequestBody College college) {
		
		Optional<College> clgOptional = collegeRepository.findById(id);
		if (clgOptional.isPresent()) {
			college.setCollegeId(id);
			collegeRepository.save(college);
			return "College details with "+id + "updated successfully";
		} else {
			return "College details with "+id + "not found";
		}
	}
	
	@DeleteMapping("/delete{id}")
	public String deleteCollegeById(@PathVariable("id") long id) {
		collegeRepository.deleteById(id);
		return "College record with "+id +" deleted successfully";
	}

	public Optional<College> getClgOptional() {
		return clgOptional;
	}

	public void setClgOptional(Optional<College> clgOptional) {
		this.clgOptional = clgOptional;
	}
}
