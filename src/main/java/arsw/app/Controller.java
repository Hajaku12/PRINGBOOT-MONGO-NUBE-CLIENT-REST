package arsw.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import arsw.app.Student;
import arsw.app.StudentRepository;

@RestController
@RequestMapping("/students")
@CrossOrigin(origins = "*")
public class Controller {
    private final StudentRepository customerRepository;

    @GetMapping
    public List<Student> getAllCustomers() {
        return customerRepository.findAll();
    }

    @Autowired
    public Controller(StudentRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @PostMapping
    public Student createCustomer(@RequestBody Student customer) {
        return customerRepository.save(customer);
    }

}