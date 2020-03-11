package lk.madushanka.mongo.test.mongo.business.custom;

import lk.madushanka.mongo.test.mongo.business.SuperBO;
import lk.madushanka.mongo.test.mongo.dto.StudentDTO;

import java.util.List;

public interface StudentBO extends SuperBO {
     List<StudentDTO> getAll();
     StudentDTO getOne(String id);
     void saveStudent(StudentDTO student);
     void deleteStudent(String id);
     void updateStudent(StudentDTO student);

}
