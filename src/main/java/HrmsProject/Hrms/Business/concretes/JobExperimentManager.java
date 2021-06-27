package HrmsProject.Hrms.Business.concretes;

import HrmsProject.Hrms.Business.abstracts.JobExperimentService;
import HrmsProject.Hrms.Core.utilities.result.DataResult;
import HrmsProject.Hrms.Core.utilities.result.Result;
import HrmsProject.Hrms.Core.utilities.result.SuccesDataResult;
import HrmsProject.Hrms.Core.utilities.result.SuccesResult;
import HrmsProject.Hrms.DataAcces.abstracts.JobExperimentDao;
import HrmsProject.Hrms.Entity.concrete.JobExperiment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobExperimentManager implements JobExperimentService {

    private JobExperimentDao jobExperimentDao;

    @Autowired
    public JobExperimentManager(JobExperimentDao jobExperimentDao) {
        this.jobExperimentDao = jobExperimentDao;
    }

    @Override
    public Result add(JobExperiment jobExperiment) {
        this.jobExperimentDao.save(jobExperiment);
        return new SuccesResult("Eklendi");
    }

    @Override
    public DataResult<List<JobExperiment>> getall() {

        return new SuccesDataResult<List<JobExperiment>>(jobExperimentDao.findAll(), "Listelendi");
    }

    @Override
    public DataResult<List<JobExperiment>> getallSorted() {
        Sort sort=Sort.by(Sort.Direction.DESC,"finishDate");
        return new SuccesDataResult<List<JobExperiment>>(this.jobExperimentDao.findAll(sort));
    }
}
