package HrmsProject.Hrms.Business.abstracts;

import HrmsProject.Hrms.Core.utilities.result.DataResult;
import HrmsProject.Hrms.Core.utilities.result.Result;
import HrmsProject.Hrms.Entity.concrete.JobPosition;

import java.util.List;

public interface JobPositionService {
    JobPosition findByJobName(String jobName);
    Result add(JobPosition jobPosition);
    DataResult<List<JobPosition>> getall();
}
