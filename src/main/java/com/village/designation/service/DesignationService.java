package com.village.designation.service;

import com.village.designation.entity.Designation;

import java.util.List;

public interface DesignationService {
    Designation saveDesignation(Designation designation);
    List<Designation> getAllDesignations();
    Designation getDesignationById(Long id);
    Designation updateDesignation(Long id, Designation designation);
    void deleteDesignation(Long id);
}