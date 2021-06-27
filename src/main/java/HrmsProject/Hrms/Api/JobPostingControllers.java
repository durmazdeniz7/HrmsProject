package HrmsProject.Hrms.Api;

import HrmsProject.Hrms.Business.abstracts.JobPostingService;
import HrmsProject.Hrms.Core.utilities.result.DataResult;
import HrmsProject.Hrms.Core.utilities.result.Result;
import HrmsProject.Hrms.Entity.concrete.JobPosting;
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
}
