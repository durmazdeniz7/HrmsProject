package HrmsProject.Hrms.Business.concretes;

import HrmsProject.Hrms.Business.abstracts.JobPositionService;
import HrmsProject.Hrms.Core.utilities.result.*;
import HrmsProject.Hrms.DataAcces.abstracts.JobPositionDao;
import HrmsProject.Hrms.Entity.concrete.JobPosition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobPositionManager implements JobPositionService {
private JobPositionDao jobPositionDao;

@Autowired
    public JobPositionManager(JobPositionDao jobPositionDao) {
        this.jobPositionDao = jobPositionDao;
    }


    @Override
    public JobPosition findByJobName(String jobName) {
        return this.jobPositionDao.findByJobName(jobName);
    }

    @Override
    public Result add(JobPosition jobPosition) {
    if (this.findByJobName(jobPosition.getJobName())!=null){

        return  new ErrorResult("Aynı isimde iş Pozisyonu var");
    }
    this.jobPositionDao.save(jobPosition);
        return new SuccesResult("İş pozisyonu Eklendi");
    }

    @Override
    public DataResult<List<JobPosition>> getall() {
        return new SuccesDataResult<List<JobPosition>>(this.jobPositionDao.findAll(),"İş pozisyonları listelendi");
    }
}
