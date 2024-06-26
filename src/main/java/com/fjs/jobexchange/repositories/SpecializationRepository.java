package com.fjs.jobexchange.repositories;

import com.fjs.jobexchange.models.Specialization;
import com.fjs.jobexchange.models.Student;
import com.fjs.jobexchange.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface SpecializationRepository extends JpaRepository<Specialization, Integer> {

    Optional<List<Specialization>> findByIndustryId(Integer industryId);
}
