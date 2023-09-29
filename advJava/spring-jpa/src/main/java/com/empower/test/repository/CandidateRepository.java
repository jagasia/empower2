package com.empower.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.empower.test.entity.Candidate;

@Repository
public interface CandidateRepository extends JpaRepository<Candidate, Integer>
{

}
