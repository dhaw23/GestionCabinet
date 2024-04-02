package com.example.doctormanager.Model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Entity
@Table(name="users")


public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long Id;
    @Column
    private String cin;
    @Column
    private String firstName;
    @Column
    private String lastName;
    @Column
    private String phone;
    @Column(name = "email",unique=true)
    private String email;
    @Column(name= "password",length = 1000)
    private String password;
    @Column
    private String accountType;
    @jakarta.persistence.Id
    private Long id;


    public long getId() {
        return Id;
    }

    public void setId(long Id) {
        this.Id = Id;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public User() {
    }

    public User(long Id, String cin, String firstName, String lastName, String phone, String email, String password) {
        this.Id = Id;
        this.cin = cin;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
        this.password = password;

    }


}
