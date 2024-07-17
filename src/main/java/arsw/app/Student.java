package arsw.app;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDate;

@Document("students")
public class Student {

  @Id
  public String name;
  public LocalDate age;
  public String department;
  public String mail;
  
  public Student() {}

  public Student(String name, String deparment, LocalDate age, String mail) {
    super();
    this.name = name;
    this.age = age;
    this.department = department;
    this.mail = mail;
}

@Override
public String toString() {
    return "Customer [mail=" + mail + ", name=" + name + ", age=" + age + ", department=" + department + "]";
}
}