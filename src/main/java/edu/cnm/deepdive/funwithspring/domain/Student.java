package edu.cnm.deepdive.funwithspring.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Student {


  @Id
  @SequenceGenerator(name="student_generator", sequenceName = "student_sequence")
  @GeneratedValue(generator = "student_generator")
  private Long id;

  private String last_name;

  private String first_name;

  @ManyToOne
  private Classroom classroom;

  public Long getId() {
    return id;
  }
  public Student() {

  }
  public Student(String last_name, String first_name) {
    this.last_name = last_name;
    this.first_name = first_name;
  }

  public String getLast_name() {
    return last_name;
  }

  public String getFirst_name() {
    return first_name;
  }

  }
