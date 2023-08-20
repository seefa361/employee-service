package com.square.employeeservice.repository;
import com.square.employeeservice.model.Office365;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface Office365Repository extends JpaRepository<Office365,Integer> {
}
