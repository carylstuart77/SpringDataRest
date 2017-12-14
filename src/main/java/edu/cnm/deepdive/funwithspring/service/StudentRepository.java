package edu.cnm.deepdive.funwithspring.service;

import edu.cnm.deepdive.funwithspring.domain.Student;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

@RepositoryRestController
public interface StudentRepository extends PagingAndSortingRepository<Student, Long> {


}
