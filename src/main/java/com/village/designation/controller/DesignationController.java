package com.village.designation.controller;

import com.village.designation.entity.Designation;
import com.village.designation.service.DesignationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/designation")
public class DesignationController {

    private final DesignationService designationService;

    @Autowired
    public DesignationController(DesignationService designationService) {
        this.designationService = designationService;
    }

    @PostMapping
    public Designation createDesignation(@RequestBody Designation designation) {
        return designationService.saveDesignation(designation);
    }

    @GetMapping
    public List<Designation> getAllDesignations() {
        return designationService.getAllDesignations();
    }

    @GetMapping("/{id}")
    public Designation getDesignationById(@PathVariable Long id) {
        return designationService.getDesignationById(id);
    }

    @PutMapping("/{id}")
    public Designation updateDesignation(@PathVariable Long id, @RequestBody Designation designation) {
        return designationService.updateDesignation(id, designation);
    }

    @DeleteMapping("/{id}")
    public String deleteDesignation(@PathVariable Long id) {
        designationService.deleteDesignation(id);
        return "Designation with ID " + id + " deleted successfully.";
    }
}
