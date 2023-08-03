package com.example.demo.Controllers;

import java.util.List;
import com.example.demo.entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.demo.services.StudentService;
@CrossOrigin("*")
@RequestMapping("/Person")
@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/getMapping")
    public ResponseEntity<List<Student>> getStudents() {
        List<Student> students = studentService.getStudents();
        return new ResponseEntity<>(students, HttpStatus.OK);
    }

    @PostMapping("/postMapping")
    public ResponseEntity<Student> saveStudent(@RequestBody Student student) {
        student = studentService.saveStudent(student);
        return new ResponseEntity<>(student, HttpStatus.CREATED);
    }

    @PutMapping("/putMapping")
    public ResponseEntity<Student> putExample(@RequestBody Student student) {
        student = studentService.updateStudent(student);
        return new ResponseEntity<>(student, HttpStatus.OK);
    }

    @DeleteMapping("/deleteMapping")
    public ResponseEntity<String> deleteExample(@RequestParam("student-id") String studentId) {
        String response = studentService.deleteStudent(studentId);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}