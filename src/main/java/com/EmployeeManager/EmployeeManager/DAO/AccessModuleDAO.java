package com.EmployeeManager.EmployeeManager.DAO;

import com.EmployeeManager.EmployeeManager.Entities.AccessModuleEntities;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AccessModuleDAO extends JpaRepository<AccessModuleEntities,Long> {
}
