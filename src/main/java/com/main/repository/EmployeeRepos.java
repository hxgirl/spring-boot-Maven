package com.main.repository;

import org.springframework.data.repository.CrudRepository;

import com.main.domain.Employee;

public interface EmployeeRepos extends CrudRepository<Employee, Integer> {

}
