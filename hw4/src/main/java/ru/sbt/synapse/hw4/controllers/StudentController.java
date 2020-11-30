package ru.sbt.synapse.hw4.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.sbt.synapse.hw4.entity.StudentDTO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@RestController
public class StudentController {
    Map<String, StudentDTO> students = new HashMap<>();

    @PostMapping("/add")
    public StudentDTO addNewStudent(@RequestBody StudentDTO studentDTO){
        students.put(studentDTO.getId(), studentDTO);
        return  studentDTO;
    }

    @GetMapping("/hello")
    public Map<String, StudentDTO> getNewStudent(){
        return students;
    }
}
