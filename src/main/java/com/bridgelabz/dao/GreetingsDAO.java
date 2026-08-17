package com.bridgelabz.DAO;

import com.bridgelabz.model.CustomRowMapper;
import com.bridgelabz.model.Greeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class GreetingsDAO {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public int addGreeting(Greeting greeting) {
        String sql = "insert into greetings(id,user_name,message) values(?,?,?)";
        return jdbcTemplate.update(sql,
                greeting.getId(),
                greeting.getUserName(),
                greeting.getMessage()
        );
    }

    public List<Greeting> findAll() {
        String sql = "select * from greetings";
        return jdbcTemplate.query(sql, new CustomRowMapper());
    }

    public List<Greeting> update(int id, Greeting greeting) {
        String sql = "update greetings set message=? where id=?";
        jdbcTemplate.update(sql,
                greeting.getMessage(),
                id);
        String selectSql = "SELECT * FROM greetings WHERE id=?";

        return jdbcTemplate.query(
                selectSql,
                new CustomRowMapper(),
                id
        );
    }

    public int delete(int id) {
        String sql = "delete from greetings where id=?";
       return jdbcTemplate.update(sql, id);
    }

    public Greeting getById(int id){
        String sql="select * from greetings where id=?";
        return (Greeting) jdbcTemplate.queryForObject(sql,new CustomRowMapper(),id);
    }

    public List<Greeting> getByUser(String user){
        String sql="select * from greetings where user_name=?";
        return jdbcTemplate.query(sql,new CustomRowMapper(),user);
    }

    public int[][] addgreetings(List<Greeting> greetings){
        String sql="insert into greetings(id,user_name,message) values(?,?,?)";
        return jdbcTemplate.batchUpdate(
                sql,
                greetings,
                greetings.size(),
                (ps, greeting) -> {
                    ps.setInt(1,greeting.getId());
                    ps.setString(2, greeting.getUserName());
                    ps.setString(3, greeting.getMessage());
                }
        );
    }
}
