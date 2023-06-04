package com.example.lineatespringproject.user;

import org.springframework.jdbc.core.JdbcTemplate;
import java.util.List;

public class UserRepository {
    private final JdbcTemplate jdbcTemplate;

    public UserRepository(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    public void addDummyUsers(User user) {
        String sql = "INSERT INTO users (name) VALUES (?)";
        jdbcTemplate.update(sql, user.getName());
    }
    public List<User> getAll(){
        String sql = "select * from users";
        return jdbcTemplate.query(sql,((rs, rowNum) ->
                new User(rs.getInt("id"),rs.getString("name"))));
    }
}
