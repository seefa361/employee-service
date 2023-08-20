package com.square.employeeservice.repository;
import com.square.employeeservice.model.SupportToolsAndApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface SupportToolsAndApplicationRepository extends JpaRepository<SupportToolsAndApplication, Integer> {
}
