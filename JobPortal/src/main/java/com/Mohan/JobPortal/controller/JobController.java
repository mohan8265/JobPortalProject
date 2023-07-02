package com.Mohan.JobPortal.controller;

import com.Mohan.JobPortal.model.Job;
import com.Mohan.JobPortal.model.JobType;
import com.Mohan.JobPortal.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class JobController {
    @Autowired
    private JobService jobService;
    @PostMapping("/jobs")
    public String addJob(@RequestBody Job job){
        return jobService.addJob(job);
    }
    @GetMapping("/jobs")
    public Iterable<Job> getAllJobs(){
        return jobService.getAllJobs();
    }
    @GetMapping("/jobs/{id}")
    public Optional<Job> getJobById(@PathVariable Long id){
        return jobService.getJobById(id);
    }
    @DeleteMapping("/jobs/{id}")
    public String deleteJobById(@PathVariable Long id){
        return jobService.deleteJobById(id);
    }
    @GetMapping("/jobs/jobType/{type}")
    public List<Job> getJobsByJobType(@PathVariable JobType type){
        return jobService.getJobsByJobType(type);
    }

}
