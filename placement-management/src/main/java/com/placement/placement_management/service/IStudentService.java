package com.placement.placement_management.service;

import com.placement.placement_management.entity.Certificate;
import com.placement.placement_management.entity.Student;

public interface IStudentService {

    Student addStudent(Student student);

    Student updateStudent(Student student);

    Student searchStudentById(long id);

    Student searchStudentByHallTicket(long ticketNo);

    Boolean addCertificate(Certificate certificate);

    Boolean updateCertificate(Certificate certificate);

    boolean deleteStudent(long id);

}