package com.placement.placement_management.repo;
import com.placement.placement_management.entity.Student;

public interface IStudentRepository {
	
	Student addStudent(Student student);
	Student updateStudent(Student student);
	Student searchStudentById(long id);
    Student searchStudentByHallTicket(long ticketNo);
    boolean deleteStudent(long id);


}
