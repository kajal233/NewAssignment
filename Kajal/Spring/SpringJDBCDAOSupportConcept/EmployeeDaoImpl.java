package com.spring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class EmployeeDaoImpl extends JdbcDaoSupport implements EmployeeDao {

	@Override
	public Employee findEmployeeById(int empId) {

		Employee emp = null;
		String query = "select * from employee where id=?";
		Object[] obj = new Object[] { empId };

		emp = (Employee) getJdbcTemplate().queryForObject(query, obj, new BeanPropertyRowMapper(Employee.class));

		return emp;
	}

	@Override
	public List<Employee> findAllEmployees() {

		List<Employee> empList = new ArrayList<Employee>();
		String query = "select * from employee";
		empList = getJdbcTemplate().query(query, new BeanPropertyRowMapper(Employee.class));
		return empList;
	}

}