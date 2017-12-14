package edu.cnm.deepdive.funwithspring.service;

import edu.cnm.deepdive.funwithspring.domain.Group;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.webmvc.RepositoryRestController;

@RepositoryRestResource(collectionResourceRel = "groups", path = "groups")
public interface GroupRepository extends PagingAndSortingRepository<Group, Long> {


}
