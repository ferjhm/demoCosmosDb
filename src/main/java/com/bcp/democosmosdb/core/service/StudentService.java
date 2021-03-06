package com.bcp.democosmosdb.core.service;

import com.bcp.democosmosdb.core.dto.StudentDto;

import java.util.List;

public interface StudentService {

    void saveStudent(StudentDto dto);

    List<StudentDto> getStudents();

    StudentDto getStudent(String id);

    void deleteStudent(String id, String lastName);
}
