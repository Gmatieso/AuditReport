package com.auditreport.report.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "Audit")
public class AuditModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "userId")
    private  Long userId;

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

}
