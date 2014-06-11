package pl.myproject.spring.model;

import org.hibernate.validator.constraints.NotEmpty;

import java.util.HashMap;
import java.util.Map;

public class Hairstylist {

    private int id;
    @NotEmpty
    private String name;
    @NotEmpty
    private String surname;
    @NotEmpty
    private String login;
    @NotEmpty
    private String password;

    public Map<String, Object> buildMap() {

        return new HairstylistMapBuilder().withName().withSurname().withLogin().withPassword().withEnabled().build();
    }


    public class HairstylistMapBuilder {

        private Map<String, Object> map = new HashMap<String, Object>();

        private HairstylistMapBuilder withName() {
            map.put("name", name);
            return this;
        }

        private HairstylistMapBuilder withSurname() {
            map.put("surname", surname);
            return this;
        }

        private HairstylistMapBuilder withLogin() {
            map.put("login", login);
            return this;
        }

        private HairstylistMapBuilder withPassword() {
            map.put("password", password);
            return this;
        }

        private HairstylistMapBuilder withEnabled() {
            map.put("enabled", 1);
            return this;
        }

        private Map<String, Object> build() {
            return map;
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

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
