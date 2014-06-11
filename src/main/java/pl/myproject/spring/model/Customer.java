package pl.myproject.spring.model;

import org.hibernate.validator.constraints.NotEmpty;

import java.util.HashMap;
import java.util.Map;


public class Customer {

    private int id;
    @NotEmpty
    private String name;
    @NotEmpty
    private String surname;
    @NotEmpty
    private String telephoneNumber;
    @NotEmpty
    private String email;
    @NotEmpty
    private String password;

    public Map<String, Object> buildCustomerMap() {
        Map<String, Object> customerMap = new CustomerMapBuilder().withName().withSurname().withEmail().withPassword().withTelephoneNumber().withEnabled().build();
        return customerMap;
    }


    public class CustomerMapBuilder {

        private Map<String, Object> customerMap = new HashMap<String, Object>();

        private CustomerMapBuilder withName() {
            customerMap.put("customerName", name);
            return this;
        }

        public CustomerMapBuilder withSurname() {
            customerMap.put("customerSurname", surname);
            return this;
        }

        public CustomerMapBuilder withEmail() {
            customerMap.put("customerEmail", email);
            return this;
        }

        public CustomerMapBuilder withTelephoneNumber() {
            customerMap.put("telephoneNumber", telephoneNumber);
            return this;
        }

        public CustomerMapBuilder withPassword() {
            customerMap.put("password", password);
            return this;
        }

        public CustomerMapBuilder withEnabled() {
            customerMap.put("enabled", 1);
            return this;
        }

        public Map<String, Object> build() {
            return customerMap;
        }
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
