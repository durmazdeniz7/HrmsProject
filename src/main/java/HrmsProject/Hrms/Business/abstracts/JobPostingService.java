package HrmsProject.Hrms.Business.abstracts;

import HrmsProject.Hrms.Core.utilities.result.DataResult;
import HrmsProject.Hrms.Core.utilities.result.Result;
import HrmsProject.Hrms.Entity.concrete.JobPosting;
import HrmsProject.Hrms.Entity.concrete.dtos.EmployerWithJobPosting;

import java.util.List;

public interface JobPostingService {
    Result add(JobPosting jobPosting);
    DataResult<List<JobPosting>> getall();
    DataResult<List<EmployerWithJobPosting>> getByEmployerWithJobPosting();
}
