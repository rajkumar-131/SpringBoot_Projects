package org.example.jobapp.service;


import org.example.jobapp.Repo.JobRepo;
import org.example.jobapp.model.JobPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService
{
    @Autowired
    private JobRepo repo;

    public void addJob(JobPost jobPost)      //this type of objects (jobpost) are called DTO(Data Transfer Object) because it transfer data to many layers form controller to service and service to repo
    {
        repo.addJob(jobPost);
    }
    public List<JobPost> getAllJobs()
    {
        return repo.getAllJobs();

    }
}
