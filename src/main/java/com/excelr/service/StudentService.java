package com.excelr.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.excelr.dto.StudentRequest;
import com.excelr.dto.StudentResponse;
import com.excelr.entity.Student;
import com.excelr.repository.StudentRepository;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repo;

    public StudentResponse save(StudentRequest req) {
        Student s = new Student(null, req.getName(), req.getEmail(), req.getCourse());
        s = repo.save(s);
        return new StudentResponse(s.getId(), s.getName(), s.getEmail(), s.getCourse());
    }

    public List<StudentResponse> getAll() {
        return repo.findAll().stream()
                .map(s -> new StudentResponse(s.getId(), s.getName(), s.getEmail(), s.getCourse()))
                .collect(Collectors.toList());
    }

    public StudentResponse getById(Long id) {
        Student s = repo.findById(id).orElseThrow();
        return new StudentResponse(s.getId(), s.getName(), s.getEmail(), s.getCourse());
    }

    public StudentResponse update(Long id, StudentRequest req) {
        Student s = repo.findById(id).orElseThrow();
        s.setName(req.getName());
        s.setEmail(req.getEmail());
        s.setCourse(req.getCourse());
        s = repo.save(s);
        return new StudentResponse(s.getId(), s.getName(), s.getEmail(), s.getCourse());
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}
