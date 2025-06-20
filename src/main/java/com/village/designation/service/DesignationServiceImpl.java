package com.village.designation.service;

import com.village.designation.entity.Designation;
import com.village.designation.repository.DesignationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DesignationServiceImpl implements DesignationService {

    private final DesignationRepository designationRepository;

    @Autowired
    public DesignationServiceImpl(DesignationRepository designationRepository) {
        this.designationRepository = designationRepository;
    }

    @Override
    public Designation saveDesignation(Designation designation) {
        return designationRepository.save(designation);
    }

    @Override
    public List<Designation> getAllDesignations() {
        return designationRepository.findAll();
    }

    @Override
    public Designation getDesignationById(Long id) {
        return designationRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Designation not found with id: " + id));
    }

    @Override
    public Designation updateDesignation(Long id, Designation updatedDesignation) {
        Designation existing = getDesignationById(id);
        existing.setProfession(updatedDesignation.getProfession());
        existing.setAbout(updatedDesignation.getAbout());
        return designationRepository.save(existing);
    }

    @Override
    public void deleteDesignation(Long id) {
        designationRepository.deleteById(id);
    }
}
