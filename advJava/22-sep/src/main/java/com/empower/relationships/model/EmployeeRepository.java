package com.empower.relationships.model;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
	List<Employee> findByName(String name);
//	List<Employee> findBySalary(Double salary);
//	@Query("SELECT * from EMPLOYEE WHERE SALARY BETWEEN X AND Y")
	@Query("select e from Employee e where e.salary between :from and :to")
	List<Employee> findEmployeesBySalaryRange(@Param("from") Double from, @Param("to") Double two);
	
}
