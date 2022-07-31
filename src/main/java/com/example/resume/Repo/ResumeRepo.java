package com.example.resume.Repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.resume.entity.Resume;

@Repository
public interface ResumeRepo extends JpaRepository<Resume, Long>{
    
}
