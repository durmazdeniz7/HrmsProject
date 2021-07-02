package HrmsProject.Hrms.DataAcces.abstracts;

import HrmsProject.Hrms.Entity.concrete.JobPosting;
import HrmsProject.Hrms.Entity.concrete.dtos.EmployerWithJobPosting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface JobPostingDao extends JpaRepository<JobPosting,Integer> {
    @Query("Select new HrmsProject.Hrms.Entity.concrete.dtos.EmployerWithJobPosting(e.id,e.companyName,j.openPosition,j.publishingDate,j.endApplyDate) FROM Employer e Inner Join e.jobPostings j")
    List<EmployerWithJobPosting> getByEmployerWithJobPosting();

}
