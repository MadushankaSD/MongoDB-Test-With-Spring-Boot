package lk.madushanka.mongo.test.mongo.repository.custom;

import lk.madushanka.mongo.test.mongo.entity.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentDAO extends MongoRepository<Student,String> {
}
