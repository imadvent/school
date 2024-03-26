package com.school.manage.app.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.school.manage.app.entity.School;

@Repository
public interface SchoolManageDao extends CrudRepository<School, Integer> {

}
