package HrmsProject.Hrms.Business.abstracts;

import HrmsProject.Hrms.Core.utilities.result.DataResult;
import HrmsProject.Hrms.Core.utilities.result.Result;
import HrmsProject.Hrms.Entity.concrete.JobPosting;
import HrmsProject.Hrms.Entity.concrete.dtos.JobRequirement;

import java.util.List;

public interface JobPostingService {
    Result add(JobPosting jobPosting);
    DataResult<List<JobPosting>> getall();
    DataResult<List<JobRequirement>> getAllActiveJob();
    DataResult<List<JobRequirement>> getListJobByDate();
    DataResult<List<JobRequirement>> getJobByCompanyName(String companyName);

    /*
    DataResult<List<CandidateWithCvTable>> getByEmployerWithJobPosting();
    DataResult<List<JobPosting>>  getByActiveJobWithCompanyName(String companyName);
     DataResult<List<JobRequriment>> getAllActiveJob();
     DataResult<List<JobRequriment>> getJobListByDate();

     */
}
