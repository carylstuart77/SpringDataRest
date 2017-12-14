package edu.cnm.deepdive.funwithspring.domain;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity

public class Classroom {
  @Id
  @SequenceGenerator(name="student_generator", sequenceName = "student_sequence")
  @GeneratedValue(generator = "student_generator")

  private Long id;

  private String name;

  @OneToMany

  private Set<Student> students;


  public String getName() {
    return name;
  }

  public Classroom() {


  }

}
