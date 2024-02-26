package com.auditreport.report.service;

import com.auditreport.report.model.AuditModel;
import com.auditreport.report.repository.AuditRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AuditService {

    @Autowired
    private AuditRepository auditRepository;

    // Get all audits
    public List<AuditModel> getAllAudits(){
        List<AuditModel> audits = new ArrayList<>();
        auditRepository.findAll().forEach(audits::add);
        return audits;

    }

    // Get an audit
    public  AuditModel getAudit(Long id) {
        Optional<AuditModel> optionalAuditModel = auditRepository.findById(id);
        if (optionalAuditModel.isPresent()) {
            return optionalAuditModel.get();
        }else {
            return null;
        }
    }

    //Add an Audit
    public AuditModel addAudit(AuditModel auditModel) {
        return auditRepository.save(auditModel);
    }

    // Update an Audit
    public AuditModel updateAudit(long id, AuditModel auditModel) {
        Optional<AuditModel> existingAuditOptional = auditRepository.findById(id);
        if(existingAuditOptional.isPresent()) {
            AuditModel existingAudit = existingAuditOptional.get();
            //update the existing audit with new data
            existingAudit.setDescription(existingAudit.getDescription());
            existingAudit.setDatetime(existingAudit.getDatetime());
            existingAudit.setRecordId(existingAudit.getRecordId());
            existingAudit.setTableName(existingAudit.getTableName());
            existingAudit.setUserAction(existingAudit.getUserAction());
            // save the updated audit
            return  auditRepository.save(existingAudit);
        }else {
            throw  new RuntimeException("Audit with ID" + id + "not found");
        }
        }

        // Delete an Audit
    public void deleteAudit(AuditModel id) {
        auditRepository.delete(id);
    }
    }

