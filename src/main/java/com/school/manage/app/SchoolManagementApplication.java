package com.school.manage.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.school.manage.app.entity.School;
import com.school.manage.app.service.SchoolManageService;

@SpringBootApplication
public class SchoolManagementApplication implements CommandLineRunner {

	@Autowired
	private SchoolManageService schoolManageService;

	public static void main(String[] args) {
		SpringApplication.run(SchoolManagementApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		School sch = new School();
		sch.setStudentName("Aasir");
		sch.setMarksObtained(440);
		sch.setTotalMarks(500);
		sch.setPercentage(89.00);
		sch.setRank(1);
		sch.setResult("Pass");
		sch.setStudentClass("Xth");
		sch.setStudentDOB("29-10-1998");

		schoolManageService.take(sch);
	}
}