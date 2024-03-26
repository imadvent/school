package com.school.manage.app.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.school.manage.app.entity.School;
import com.school.manage.app.service.SchoolManageService;

@RestController
@RequestMapping(value = "/result") // context path
public class SchoolManageController {

	@Autowired
	private SchoolManageService schoolManageService;

	@PostMapping(value = "/insert") // create records
	public School viewResult(@RequestBody School school) { // @RequestBody will convert JSON into java object
		return schoolManageService.viewResult(school);
	}

	@GetMapping(value = "/studentid/{studentId}") // read individual records
	public Optional<School> getResultById(@PathVariable("studentId") Integer studentId) {
		return schoolManageService.getResultById(studentId);
	}

	@GetMapping(value = "/get/records") // read all records
	public Iterable<School> getAllRecords() {
		return schoolManageService.getAllRecords();
	}

	@DeleteMapping(value = "studentid/{studentId}") // delete
	public void deleteRecord(@PathVariable("studentId") Integer studentId) {
		schoolManageService.deleteRecord(studentId);
	}

	@PutMapping(value = "/updatepercentage/{studentId}/{percentage}") // update
	public School updatePercentage(@PathVariable("studentId") Integer studentId,
			@PathVariable("percentage") Double newPercentage) {
		return schoolManageService.updatePercentage(studentId, newPercentage);
	}

	@GetMapping(value = "/hello")
	public String hello() {
		return "hello";
	}

	@PutMapping(value = "/updaterank/{studentId}/{rank}")
	public School updateRank(@PathVariable("studentId") Integer studentId, @PathVariable("rank") Integer newRank) {
		return schoolManageService.updateRank(studentId, newRank);
	}
}