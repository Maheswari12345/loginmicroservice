package com.devglan.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devglan.model.Courses;

public interface CoursesDao extends JpaRepository<Courses,Integer>{

}
