package edu.cnm.deepdive.funwithspring.service;

import edu.cnm.deepdive.funwithspring.domain.Membership;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "memberships", path = "memberships")
public interface MembershipController extends PagingAndSortingRepository<Membership, Long> {


}
