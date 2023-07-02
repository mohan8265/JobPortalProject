package com.Mohan.JobPortal.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Job {

    @Id
    private Long jobId;
    @NotBlank
    private String title;
    @NotEmpty
    private String description;
    private String location;
    @Min(value = 20000)
    private Double salary;   // (hint @min for salary : should be above 20,000 )
    @Email
    private String companyEmail;
    private String companyName;
    private String employerName;
    private JobType jobType;
    private LocalDate appliedDate;
}
