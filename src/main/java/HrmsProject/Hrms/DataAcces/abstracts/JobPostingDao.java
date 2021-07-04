package HrmsProject.Hrms.DataAcces.abstracts;

import HrmsProject.Hrms.Entity.concrete.JobPosting;
import HrmsProject.Hrms.Entity.concrete.dtos.JobRequirement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface JobPostingDao extends JpaRepository<JobPosting,Integer> {

    @Query("Select new HrmsProject.Hrms.Entity.concrete.dtos.JobRequirement(j.id,j.isActive,e.companyName,jp.jobName,j.openPosition,j.publishingDate,j.endApplyDate) " +
            "From JobPosting j Inner join j.employer e Inner Join j.jobPosition jp where j.isActive=true")
    List<JobRequirement> getAllActiveJob();

    @Query("Select new HrmsProject.Hrms.Entity.concrete.dtos.JobRequirement(j.id,j.isActive,e.companyName,jp.jobName,j.openPosition,j.publishingDate,j.endApplyDate) " +
            "From JobPosting j Inner join j.employer e Inner Join j.jobPosition jp where j.isActive=true order by j.publishingDate desc")
    List<JobRequirement> getListJobByDate();

    @Query("Select new HrmsProject.Hrms.Entity.concrete.dtos.JobRequirement(j.id,j.isActive,e.companyName,jp.jobName,j.openPosition,j.publishingDate,j.endApplyDate) " +
            "From JobPosting j Inner join j.employer e Inner Join j.jobPosition jp where j.isActive=true and e.companyName=:companyName")
    List<JobRequirement> getJobByCompanyName(String companyName);



}
