package com.Mohan.JobPortal.service;

import com.Mohan.JobPortal.model.Job;
import com.Mohan.JobPortal.model.JobType;
import com.Mohan.JobPortal.repository.IJobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobService {
    @Autowired
    private IJobRepo jobRepo;


    public String addJob(Job job) {
        jobRepo.save(job);
        return "Job added successfully";
    }

    public Iterable<Job> getAllJobs() {
        return jobRepo.findAll();
    }

    public Optional<Job> getJobById(Long id) {
        return jobRepo.findById(id);
    }

    public String deleteJobById(Long id) {
        jobRepo.deleteById(id);
        return "job deleted";
    }

    public List<Job> getJobsByJobType(JobType type) {
        return jobRepo.findByJobType(type);
    }
}
