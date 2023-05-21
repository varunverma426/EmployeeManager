package com.EmployeeManager.EmployeeManager.DAO;

import com.EmployeeManager.EmployeeManager.Entities.EmployeeEntities;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeDAO extends JpaRepository<EmployeeEntities,Long> {
}
