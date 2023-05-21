package com.EmployeeManager.EmployeeManager.DAO;

import com.EmployeeManager.EmployeeManager.Entities.DeskEntities;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeskDAO extends JpaRepository<DeskEntities,Long> {
}
