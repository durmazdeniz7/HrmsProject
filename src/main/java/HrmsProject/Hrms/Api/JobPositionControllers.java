package HrmsProject.Hrms.Api;

import HrmsProject.Hrms.Business.abstracts.JobPositionService;
import HrmsProject.Hrms.Core.utilities.result.DataResult;
import HrmsProject.Hrms.Core.utilities.result.Result;
import HrmsProject.Hrms.Entity.concrete.JobPosition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/jobpositionControllers")
public class JobPositionControllers {
    private JobPositionService jobPositionService;

    @Autowired
    public JobPositionControllers(JobPositionService jobPositionService) {
        this.jobPositionService = jobPositionService;
    }
    @PostMapping("/add")
    public Result add(JobPosition jobPosition){
        return this.jobPositionService.add(jobPosition);
    }
    @RequestMapping("/getall")

    public DataResult<List<JobPosition>> getall(){
        return this.jobPositionService.getall();
    }
}
