package com.square.employeeservice.repository;
import com.square.employeeservice.model.ApplicationAndSystemRequirement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ApplicationAndSystemRequirementRepository extends JpaRepository<ApplicationAndSystemRequirement, Integer> {
}
