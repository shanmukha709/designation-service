package com.village.designation.repository;

import com.village.designation.entity.Designation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DesignationRepository extends JpaRepository<Designation, Long> {
    // We can add custom query methods here if needed later
}