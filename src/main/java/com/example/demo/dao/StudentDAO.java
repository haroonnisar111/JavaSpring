package com.example.demo.dao;

import com.example.demo.entity.Student;

import java.util.List;

public interface StudentDAO {
    void save (Student theStu);
    Student findbyId(Integer id);
    List<Student> findAll();
    List<Student> FindByLastName(String Lastname);
    void updateStudent(Student student);
    void deleteStudent(Integer id);

}
