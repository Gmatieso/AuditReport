package com.auditreport.report.model;

import jakarta.persistence.*;

@Entity
@Table(name = "UserTable")
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "userName")
    private String userName;

    public UserModel() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public UserModel(Long id, String userName) {
        this.id = id;
        this.userName = userName;
    }
}
