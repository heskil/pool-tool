package com.management.poolmanagement.model;

import jakarta.persistence.*;

@Entity
@Table
public class User {

    @Id
    @Column
    @GeneratedValue
    private Long id;

    @Column
    private String username;

    @Column
    private String email;

    @Column
    private String password;

    public User() {
    }
    public User(String pEmail, String pUsername, String pPassword) {
        this.email = pEmail;
        this.username = pUsername;
        this.password = pPassword;
    }
    public Long getId() {
        return this.id;
    }

    public String getUsername() {
        return this.username;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPassword() {
        return this.password;
    }

    public void setUsername(String pUsername) {
        this.username = pUsername;
    }

    public void setEmail(String pEmail) {
        this.email = pEmail;
    }

    public void setPassword(String pPassword) {
        this.password = pPassword;
    }

    //TODO remove unsafe return of values
    public String toString() {
        return "Id: " + this.id + "\n" + "Username: " + this.username + "\n" + "E-Mail: " + this.email + "\n";
    }
}
