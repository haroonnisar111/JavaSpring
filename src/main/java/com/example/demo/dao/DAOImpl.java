package com.example.demo.dao;

import com.example.demo.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DAOImpl implements StudentDAO {
    private EntityManager entityManager;
   @Autowired
    public DAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public void save(Student theStu) {
       entityManager.persist(theStu);

    }

    @Override
    public Student findbyId(Integer id) {
       return entityManager.find(Student.class,id);
    }

    @Override
    public List<Student> findAll() {
        TypedQuery<Student> typedQuery=entityManager.createQuery("FROM Student",Student.class);
        return typedQuery.getResultList();
    }

    @Override
    public List<Student> FindByLastName(String Lastname) {
        TypedQuery<Student> typedQuery=entityManager.createQuery("FROM Student WHERE LastName=:theDta",Student.class);
        typedQuery.setParameter("theDta",Lastname);
        return typedQuery.getResultList();
    }

    @Override
    @Transactional
    public void updateStudent(Student student) {
         entityManager.merge(student);
    }

    @Override
    public void deleteStudent(Integer id) {
       Student student=entityManager.find(Student.class,id);
       entityManager.remove(student);
    }
}
