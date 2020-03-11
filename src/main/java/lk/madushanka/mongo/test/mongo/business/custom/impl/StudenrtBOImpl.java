package lk.madushanka.mongo.test.mongo.business.custom.impl;
import lk.madushanka.mongo.test.mongo.business.custom.StudentBO;
import lk.madushanka.mongo.test.mongo.dto.StudentDTO;
import lk.madushanka.mongo.test.mongo.entity.Student;
import lk.madushanka.mongo.test.mongo.repository.custom.StudentDAO;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class StudenrtBOImpl implements StudentBO {

    @Autowired
    private StudentDAO studentDAO;

    @Override
    public List<StudentDTO> getAll() {
        ArrayList<StudentDTO> studentDTOS = new ArrayList<>();
        List<Student> all = studentDAO.findAll();
        for (Student student : all) {
            studentDTOS.add(new StudentDTO(student.getId(),student.getName(),student.getAddress(),student.getTelephone()));
        }
        return studentDTOS;
    }

    @Override
    public StudentDTO getOne(String id) {
        Student student = studentDAO.findById(id).get();
        StudentDTO studentDTO = new StudentDTO(student.getId(), student.getName(), student.getAddress(), student.getTelephone());
        return studentDTO;


    }

    @Override
    public void saveStudent(StudentDTO student) {
        studentDAO.save(new Student(student.getId(),student.getName(),student.getAddress(),student.getTelephone()));
    }

    @Override
    public void deleteStudent(String id) {
        studentDAO.deleteById(id);
    }

    @Override
    public void updateStudent(StudentDTO student) {
        studentDAO.save(new Student(student.getId(),student.getName(),student.getAddress(),student.getTelephone()));
    }
}
