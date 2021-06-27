package HrmsProject.Hrms.Api;

import HrmsProject.Hrms.Business.abstracts.JobExperimentService;
import HrmsProject.Hrms.Core.utilities.result.DataResult;
import HrmsProject.Hrms.Core.utilities.result.Result;
import HrmsProject.Hrms.Entity.concrete.JobExperiment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.crypto.Data;
import java.util.List;

@RestController
@RequestMapping("/api/jobexperiment")
public class JobExperimentControllers {
    private JobExperimentService jobExperimentService;

    @Autowired
    public JobExperimentControllers(JobExperimentService jobExperimentService) {
        this.jobExperimentService = jobExperimentService;
    }
    @PostMapping("/add")
    public Result add(JobExperiment jobExperiment){
        return this.jobExperimentService.add(jobExperiment);
    }
    @RequestMapping("/getall")
    public DataResult<List<JobExperiment>>getall(){
        return this.jobExperimentService.getall();
    }
}
