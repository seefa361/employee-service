package com.square.employeeservice.repository;
import com.square.employeeservice.model.TypeOfDevice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
public interface TypeOfDeviceRepository extends JpaRepository<TypeOfDevice,Integer> {
}
