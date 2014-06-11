package pl.myproject.spring.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.Map;

@Repository
public class HairstylistResources {

    private JdbcTemplate jdbcTemplate;
    private SimpleJdbcInsert hairstylistInsert;

    @Autowired
    public HairstylistResources(DataSource dataSource) {

        jdbcTemplate = new JdbcTemplate(dataSource);
        hairstylistInsert = new SimpleJdbcInsert(dataSource).withTableName("hairstylist");
    }

    public void createHairstylistAccount(Map<String, Object> map) {

        hairstylistInsert.execute(map);

        String sql = "INSERT INTO user_roles (username, role) VALUES('" + map.get("login") + "', 'ROLE_EMPLOYE')";

        jdbcTemplate.execute(sql);
    }
}
