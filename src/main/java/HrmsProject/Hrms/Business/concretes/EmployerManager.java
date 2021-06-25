package HrmsProject.Hrms.Business.concretes;

import HrmsProject.Hrms.Business.abstracts.EmployerService;
import HrmsProject.Hrms.Core.utilities.result.*;
import HrmsProject.Hrms.DataAcces.abstracts.EmployerDao;
import HrmsProject.Hrms.Entity.concrete.Employer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployerManager implements EmployerService {
    private EmployerDao employerDao;

    @Autowired
    public EmployerManager(EmployerDao employerDao) {
        this.employerDao = employerDao;
    }


    @Override
    public Employer findByEmail(String email) {
        return this.employerDao.findByEmail(email);
    }

    @Override
    public Result add(Employer employer) {
        if (this.findByEmail(employer.getEmail()) !=null) {
            return new ErrorResult("Daha önce kayıtlı email var");
        }
        this.employerDao.save(employer);
        return new SuccesResult("Eklendi");
    }

    @Override
    public DataResult<List<Employer>> getall() {
        return new SuccesDataResult<List<Employer>>(this.employerDao.findAll(),"Listelendi");
    }
}
