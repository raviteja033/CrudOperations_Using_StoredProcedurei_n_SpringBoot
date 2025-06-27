package com.example.crud_procedure_jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class EmployeeDAO {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public EmployeeDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    public void insertEmployee(String fname, String lname) {
        String sql = "CALL InsertEmployee(?, ?)";
        jdbcTemplate.update(sql, fname, lname);
    }


    public List<Map<String, Object>> getAllEmployees() {
        String sql = "CALL GetAllEmployees()";
        return jdbcTemplate.queryForList(sql);
    }


    public Map<String, Object> getEmployeeById(Long id) {
        String sql = "CALL GetEmployeeById(?)";
        return jdbcTemplate.queryForMap(sql, id);
    }


    public void updateEmployee(Long id, String fname, String lname) {
        String sql = "CALL UpdateEmployee(?, ?, ?)";
        jdbcTemplate.update(sql, id, fname, lname);
    }


    public void deleteEmployee(Long id) {
        String sql = "CALL DeleteEmployee(?)";
        jdbcTemplate.update(sql, id);
    }
}
