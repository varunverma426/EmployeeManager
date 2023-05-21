package com.EmployeeManager.EmployeeManager.DAO;

import com.EmployeeManager.EmployeeManager.Entities.AssetEntities;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssetDAO extends JpaRepository<AssetEntities,Long> {
}
