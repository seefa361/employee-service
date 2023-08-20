package com.square.employeeservice.repository;
import com.square.employeeservice.model.VirtualWorkingEnv;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface VirtualWorkingEnvRepository extends JpaRepository<VirtualWorkingEnv,Integer> {
}
