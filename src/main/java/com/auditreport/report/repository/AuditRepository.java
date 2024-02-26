package com.auditreport.report.repository;

import com.auditreport.report.model.AuditModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuditRepository extends JpaRepository<AuditModel,Long> {
}
