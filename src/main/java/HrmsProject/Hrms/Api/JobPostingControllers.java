package HrmsProject.Hrms.Api;

import HrmsProject.Hrms.Business.abstracts.JobPostingService;
import HrmsProject.Hrms.Core.utilities.result.DataResult;
import HrmsProject.Hrms.Core.utilities.result.Result;
import HrmsProject.Hrms.Entity.concrete.JobPosting;
import HrmsProject.Hrms.Entity.concrete.dtos.JobRequirement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/JobPostingControllers")
public class JobPostingControllers {
    private JobPostingService jobPostingService;


    @Autowired
    public JobPostingControllers(JobPostingService jobPostingService) {
        this.jobPostingService = jobPostingService;
    }
    @PostMapping("add")
    public Result add(JobPosting jobPosting){
        return this.jobPostingService.add(jobPosting);
    }
    @RequestMapping("/getall")
    public DataResult<List<JobPosting>> getall(){
        return this.jobPostingService.getall();
    }

@RequestMapping("/getAllActiveJob")
    public DataResult<List<JobRequirement>> getAllActiveJob() {
        return this.jobPostingService.getAllActiveJob();
}
    @RequestMapping("/getListJobByDate")
    public DataResult<List<JobRequirement>> getListJobByDate(){
        return this.jobPostingService.getListJobByDate();
    }

    @RequestMapping("/getJobByCompanyName")
    public DataResult<List<JobRequirement>> getJobByCompanyName(String companyName){
        return this.jobPostingService.getJobByCompanyName(companyName);
    }

    /*
    @RequestMapping("/getByEmployerWithJobPosting")
    public DataResult<List<CandidateWithCvTable>> getByEmployerWithJobPosting(){
        return  this.jobPostingService.getByEmployerWithJobPosting();
    }

    @RequestMapping("/getByActiveJob")
    public DataResult<List<JobPosting>>  getByActiveJob(String companyName){
        return this.jobPostingService.getByActiveJobWithCompanyName(companyName);
    }
    @RequestMapping("/getAllActiveJob")
    public DataResult<List<JobRequriment>> getAllActiveJob(){
        return this.jobPostingService.getAllActiveJob();
    }


    @RequestMapping("/getJobListByDate")
    public DataResult<List<JobRequriment>> getJobListByDate(){
        return this.jobPostingService.getJobListByDate();
    }


     */

}
