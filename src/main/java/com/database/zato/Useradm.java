package com.database.zato;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by Alexey on 04.07.2017.
 */
@Entity
public class Useradm {
    private int id;
    private String firstname;
    private String lastname;
    private String secondname;
    private String position;
    private String phone;
    private String email;
    private Date birthday;
    private Date employmentdate;
    private String login;
    private String password;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "firstname")
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    @Basic
    @Column(name = "lastname")
    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Basic
    @Column(name = "secondname")
    public String getSecondname() {
        return secondname;
    }

    public void setSecondname(String secondname) {
        this.secondname = secondname;
    }

    @Basic
    @Column(name = "position")
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Basic
    @Column(name = "phone")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "birthday", nullable = true, insertable = true, updatable = true)
    public java.util.Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "employmentdate", nullable = true, insertable = true, updatable = true)
    public java.util.Date getEmploymentdate() {
        return employmentdate;
    }

    public void setEmploymentdate(Date employmentdate) {
        this.employmentdate = employmentdate;
    }

    @Basic
    @Column(name = "login")
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Useradm useradm = (Useradm) o;

        if (id != useradm.id) return false;
        if (firstname != null ? !firstname.equals(useradm.firstname) : useradm.firstname != null) return false;
        if (lastname != null ? !lastname.equals(useradm.lastname) : useradm.lastname != null) return false;
        if (secondname != null ? !secondname.equals(useradm.secondname) : useradm.secondname != null) return false;
        if (position != null ? !position.equals(useradm.position) : useradm.position != null) return false;
        if (phone != null ? !phone.equals(useradm.phone) : useradm.phone != null) return false;
        if (email != null ? !email.equals(useradm.email) : useradm.email != null) return false;
        if (birthday != null ? !birthday.equals(useradm.birthday) : useradm.birthday != null) return false;
        if (employmentdate != null ? !employmentdate.equals(useradm.employmentdate) : useradm.employmentdate != null)
            return false;
        if (login != null ? !login.equals(useradm.login) : useradm.login != null) return false;
        if (password != null ? !password.equals(useradm.password) : useradm.password != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (firstname != null ? firstname.hashCode() : 0);
        result = 31 * result + (lastname != null ? lastname.hashCode() : 0);
        result = 31 * result + (secondname != null ? secondname.hashCode() : 0);
        result = 31 * result + (position != null ? position.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (birthday != null ? birthday.hashCode() : 0);
        result = 31 * result + (employmentdate != null ? employmentdate.hashCode() : 0);
        result = 31 * result + (login != null ? login.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        return result;
    }
}
