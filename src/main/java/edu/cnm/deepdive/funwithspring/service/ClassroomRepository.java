package edu.cnm.deepdive.funwithspring.service;

import edu.cnm.deepdive.funwithspring.domain.Classroom;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ClassroomRepository
    extends PagingAndSortingRepository<Classroom, Long> {

}
