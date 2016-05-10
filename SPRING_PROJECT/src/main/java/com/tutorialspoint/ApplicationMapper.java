package com.tutorialspoint;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.miempresa.Application;

public class ApplicationMapper implements RowMapper<Application> {
   public Application mapRow(ResultSet rs, int rowNum) throws SQLException {
	   Application student = new Application();
      student.setLoanCode(rs.getInt("id"));
      student.setBoCode(rs.getInt("name"));
      student.setLoanAmt(rs.getInt("age"));
      student.setLoanAmt(rs.getInt("age"));
      return student;
   }
}