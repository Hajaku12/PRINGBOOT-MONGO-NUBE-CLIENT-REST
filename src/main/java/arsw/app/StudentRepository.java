package arsw.app;

import java.util.List;
import java.time.LocalDate;
import org.springframework.data.mongodb.repository.MongoRepository;
import arsw.app.Student;

public interface StudentRepository extends MongoRepository<Student, String> {

    public List<Student> findByName(String name);
    
    public Student findByAge(LocalDate age);

    public List<Student> findByDepartment(String department);

}