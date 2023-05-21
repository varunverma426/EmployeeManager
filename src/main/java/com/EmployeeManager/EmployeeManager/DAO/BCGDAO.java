package com.EmployeeManager.EmployeeManager.DAO;

import com.EmployeeManager.EmployeeManager.Entities.BCGEntities;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BCGDAO extends JpaRepository<BCGEntities,Long> {
}
