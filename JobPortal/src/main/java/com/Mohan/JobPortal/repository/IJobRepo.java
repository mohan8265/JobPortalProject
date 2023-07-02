package com.Mohan.JobPortal.repository;

import com.Mohan.JobPortal.model.Job;
import com.Mohan.JobPortal.model.JobType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IJobRepo extends CrudRepository<Job, Long> {
    List<Job> findByJobType(JobType type);
}
