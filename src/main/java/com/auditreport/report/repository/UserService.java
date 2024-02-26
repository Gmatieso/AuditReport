package com.auditreport.report.repository;

import com.auditreport.report.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserService extends JpaRepository<UserModel,Long> {
}
