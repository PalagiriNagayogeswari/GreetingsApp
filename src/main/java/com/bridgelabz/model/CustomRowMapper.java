package com.bridgelabz.model;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomRowMapper implements RowMapper {
    @Override
    public Greeting mapRow(ResultSet rs, int rowNum) throws SQLException {
        Greeting greeting = new Greeting();

        greeting.setId(rs.getInt("id"));
        greeting.setUserName(rs.getString("user_name"));
        greeting.setMessage(rs.getString("message"));
        return greeting;
    }
}


