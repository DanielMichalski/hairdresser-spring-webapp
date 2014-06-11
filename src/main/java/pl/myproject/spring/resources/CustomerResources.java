package pl.myproject.spring.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;
import pl.myproject.spring.model.Customer;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Repository
public class CustomerResources {

    private JdbcTemplate jdbcTemplate;
    private SimpleJdbcInsert reportsInsert;
    private SimpleJdbcInsert customerInsert;

    @Autowired
    public CustomerResources(DataSource dataSource) {

        this.jdbcTemplate = new JdbcTemplate(dataSource);
        this.reportsInsert = new SimpleJdbcInsert(dataSource).withTableName("accountwaitingforverified");
        this.customerInsert = new SimpleJdbcInsert(dataSource).withTableName("customer");
    }


    public void addAccountToAccountsWaitingForVerified(Map<String, Object> customerMap) {

        reportsInsert.execute(customerMap);
    }

    public void createCustomerAccount(Map<String, Object> customerMap) {

        customerInsert.execute(customerMap);

        String sql = "INSERT INTO user_roles (username, role) VALUES('" + customerMap.get("customerEmail") + "', 'ROLE_USER')";

        jdbcTemplate.execute(sql);
    }

    public List<Customer> getAccountWaitingForVerifiedList() {

        List<Map<String, Object>> list = jdbcTemplate.queryForList("SELECT *FROM accountwaitingforverified");

        List<Customer> accountList = new ArrayList<Customer>();

        for (Map<String, Object> r : list) {
            Customer s = new Customer();
            s.setId((Integer) r.get("id"));
            s.setName((String) r.get("customerName"));
            s.setSurname((String) r.get("customerSurname"));
            s.setEmail((String) r.get("customerEmail"));
            s.setPassword((String) r.get("password"));
            s.setTelephoneNumber((String) r.get("telephoneNumber"));

            accountList.add(s);
        }

        return accountList;
    }


    public void deleteReportsFromDatabase(int id) {

        String query = "DELETE FROM accountwaitingforverified WHERE id=" + Integer.toString(id);

        jdbcTemplate.execute(query);
    }

}
