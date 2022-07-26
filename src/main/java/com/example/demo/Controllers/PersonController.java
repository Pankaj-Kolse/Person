package com.example.demo.Controllers;


import com.example.demo.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping("/api")
@RestController
    public class PersonController {

        @Autowired
        private PersonService personService;

        @GetMapping("/persons")
        public ResponseEntity<?> getAllPersons() {
            return ResponseEntity.ok(this.personService.getAllPerson());
        }
    }

