package com.placement.placement_management.repo;

import com.placement.placement_management.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class StudentRepository implements IStudentRepository {

    @PersistenceContext
    private EntityManager entityManager;
    
    @Transactional
    @Override
    public Student addStudent(Student student) {
        entityManager.persist(student);
        return student;
    }

    @Override
    public Student updateStudent(Student student) {
        return entityManager.merge(student);
    }

    @Override
    public Student searchStudentById(long id) {
        return entityManager.find(Student.class, id);
    }

    @Override
    public Student searchStudentByHallTicket(long ticketNo) {
        return entityManager.createQuery(
                        "SELECT s FROM Student s WHERE s.hallTicketNo = :ticketNo",
                        Student.class)
                .setParameter("ticketNo", ticketNo)
                .getSingleResult();
    }
    
    @Transactional
    @Override
    public boolean deleteStudent(long id) {

        Student student = entityManager.find(Student.class, id);

        if (student != null) {
            entityManager.remove(student);
            return true;
        }

        return false;
    }
}