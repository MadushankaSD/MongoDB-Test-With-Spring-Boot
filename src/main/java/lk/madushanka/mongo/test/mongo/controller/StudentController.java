package lk.madushanka.mongo.test.mongo.controller;

import lk.madushanka.mongo.test.mongo.business.custom.StudentBO;
import lk.madushanka.mongo.test.mongo.dto.StudentDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

    @Autowired
    private StudentBO studentBO;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<StudentDTO> getAll(){
        List<StudentDTO> all = studentBO.getAll();
        return all;

    }

    @GetMapping(value = "/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public StudentDTO get(@PathVariable String id){
        StudentDTO one = studentBO.getOne(id);
        return one;
    }

    @DeleteMapping(value = "/{id}",consumes = MediaType.APPLICATION_JSON_VALUE)
    public void delete(@PathVariable String id){
        studentBO.deleteStudent(id);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public void save(@RequestBody StudentDTO student){
        studentBO.saveStudent(student);
    }

    @PutMapping(value = "/{id}",consumes = MediaType.APPLICATION_JSON_VALUE)
    public void update(@PathVariable String id,@RequestBody StudentDTO student){
        studentBO.updateStudent(student);
    }

}
