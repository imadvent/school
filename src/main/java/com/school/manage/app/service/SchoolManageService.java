package com.school.manage.app.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.manage.app.dao.SchoolManageDao;
import com.school.manage.app.entity.School;

@Service
public class SchoolManageService {

	@Autowired
	private SchoolManageDao schoolManageDao;

	public School viewResult(School school) {
		return schoolManageDao.save(school);
	}

	public Optional<School> getResultById(Integer studentId) {
		return schoolManageDao.findById(studentId);
	}

	public Iterable<School> getAllRecords() {
		return schoolManageDao.findAll();
	}

	public void deleteRecord(Integer studentId) {
		schoolManageDao.deleteById(studentId);
	}

	public School updatePercentage(Integer studentId, Double newPercentage) {
		School update = schoolManageDao.findById(studentId).orElseThrow();
		update.setPercentage(newPercentage);
		School newRecord = schoolManageDao.save(update);
		return newRecord;
	}

	public School updateRank(Integer studentId, Integer newRank) {
		School update = schoolManageDao.findById(studentId).orElseThrow();
		update.setRank(newRank);
		School newRecord = schoolManageDao.save(update);
		return newRecord;
	}

	public School take(School sch) {
		return schoolManageDao.save(sch);
	}
}