package HrmsProject.Hrms.Business.concretes;

import HrmsProject.Hrms.Business.abstracts.JobPostingService;
import HrmsProject.Hrms.Core.utilities.result.DataResult;
import HrmsProject.Hrms.Core.utilities.result.Result;
import HrmsProject.Hrms.Core.utilities.result.SuccesDataResult;
import HrmsProject.Hrms.Core.utilities.result.SuccesResult;
import HrmsProject.Hrms.DataAcces.abstracts.JobPostingDao;
import HrmsProject.Hrms.Entity.concrete.JobPosting;
import HrmsProject.Hrms.Entity.concrete.dtos.EmployerWithJobPosting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobPostingManager implements JobPostingService {
    private JobPostingDao jobPostingDao;

    @Autowired
    public JobPostingManager(JobPostingDao jobPostingDao) {
        this.jobPostingDao = jobPostingDao;
    }


    @Override
    public Result add(JobPosting jobPosting) {
       this.jobPostingDao.save(jobPosting);
        return new SuccesResult("İş eklendi");
    }

    @Override
    public DataResult<List<JobPosting>> getall() {
        return new SuccesDataResult<List<JobPosting>>(this.jobPostingDao.findAll(),"Listelendi");
    }

    @Override
    public DataResult<List<EmployerWithJobPosting>> getByEmployerWithJobPosting() {
        return new SuccesDataResult<List<EmployerWithJobPosting>>(this.jobPostingDao.getByEmployerWithJobPosting());
    }

    @Override
    public DataResult<List<JobPosting>> getByActiveJobWithCompanyName(String companyName) {
        return new SuccesDataResult<List<JobPosting>>(this.jobPostingDao.getByActiveJobWithCompanyName(companyName));
    }
}
