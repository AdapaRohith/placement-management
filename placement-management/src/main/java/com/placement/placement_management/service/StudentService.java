package com.placement.placement_management.service;

import org.springframework.stereotype.Service;

import com.placement.placement_management.entity.Certificate;
import com.placement.placement_management.entity.Student;
import com.placement.placement_management.repo.IStudentRepository;

@Service
public class StudentService implements IStudentService {

    private final IStudentRepository studentRepository;

    public StudentService(IStudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Student addStudent(Student student) {
        return studentRepository.addStudent(student);
    }

    @Override
    public Student updateStudent(Student student) {
        return studentRepository.updateStudent(student);
    }

    @Override
    public Student searchStudentById(long id) {
        return studentRepository.searchStudentById(id);
    }

    @Override
    public Student searchStudentByHallTicket(long ticketNo) {
        return studentRepository.searchStudentByHallTicket(ticketNo);
    }

    @Override
    public Boolean addCertificate(Certificate certificate) {
        return false;
    }

    @Override
    public Boolean updateCertificate(Certificate certificate) {
        return false;
    }

    @Override
    public boolean deleteStudent(long id) {
        return studentRepository.deleteStudent(id);
    }
}