package com.auditreport.report.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "AuditTable")
public class AuditModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    // Enhance relationship with UserModel
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "userId", referencedColumnName = "id")
    @Column(name = "userId")
    private String userId;

    @Column(name = "userAction")
    private String userAction;

    @Column(name = "description")
    private String description;

    @Column(name = "tableName")
    private String tableName;

    @Column(name = "recordId")
    private Long recordId;

    @Column(name = "datetime")
    private Date datetime;

    public AuditModel() {
    }

    // Getter and setter for UserModel
//    public UserModel getUser() {
//        return user;
//    }
//
//    public void setUser(UserModel user) {
//        this.user = user;
//    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserAction() {
        return userAction;
    }

    public void setUserAction(String userAction) {
        this.userAction = userAction;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public Long getRecordId() {
        return recordId;
    }

    public void setRecordId(Long recordId) {
        this.recordId = recordId;
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    public AuditModel(Long id, String user, String userAction, String description, String tableName, Long recordId, Date datetime) {
        this.id = id;
        this.userId = user;
        this.userAction = userAction;
        this.description = description;
        this.tableName = tableName;
        this.recordId = recordId;
        this.datetime = datetime;
    }
}
