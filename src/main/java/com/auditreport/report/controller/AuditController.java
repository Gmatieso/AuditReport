package com.auditreport.report.controller;


import com.auditreport.report.model.AuditModel;
import com.auditreport.report.service.AuditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/audits")
public class AuditController {

    @Autowired
    private AuditService auditService;

    //Get a List of All Audits
    @GetMapping
    public List<AuditModel> getAllAudits(){
        return auditService.getAllAudits();
    }

    //build or create Audit REST API
    @PostMapping
    public AuditModel addAudit(@RequestBody AuditModel auditModel) {
        return auditService.addAudit(auditModel);
    }

    @PutMapping("{id}")
    public AuditModel getAudit(@PathVariable long id, @RequestBody AuditModel auditModel){
        return auditService.getAudit(id,auditModel);
    }

    @DeleteMapping({"id"})
    public void deleteTopic(@PathVariable AuditModel id){
        auditService.deleteAudit(id);
    }

}
