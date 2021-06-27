package HrmsProject.Hrms.Business.abstracts;

import HrmsProject.Hrms.Core.utilities.result.DataResult;
import HrmsProject.Hrms.Core.utilities.result.Result;
import HrmsProject.Hrms.Entity.concrete.JobExperiment;

import java.util.List;

public interface JobExperimentService {
    Result  add(JobExperiment jobExperiment);
    DataResult<List<JobExperiment>> getall();
}
