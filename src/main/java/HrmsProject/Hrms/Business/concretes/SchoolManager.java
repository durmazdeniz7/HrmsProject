package HrmsProject.Hrms.Business.concretes;

import HrmsProject.Hrms.Business.abstracts.SchoolService;
import HrmsProject.Hrms.Core.utilities.result.DataResult;
import HrmsProject.Hrms.Core.utilities.result.Result;
import HrmsProject.Hrms.Core.utilities.result.SuccesDataResult;
import HrmsProject.Hrms.Core.utilities.result.SuccesResult;
import HrmsProject.Hrms.DataAcces.abstracts.SchoolDao;
import HrmsProject.Hrms.Entity.concrete.School;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolManager implements SchoolService {
    private SchoolDao schoolDao;

    @Autowired
    public SchoolManager(SchoolDao schoolDao) {
        this.schoolDao = schoolDao;
    }

    @Override
    public Result add(School school) {
        this.schoolDao.save(school);
        return new SuccesResult("Okul Eklendi");
    }

    @Override
    public DataResult<List<School>> getall() {
        return new SuccesDataResult<List<School>>(this.schoolDao.findAll(),"Okullar Listelendi");
    }
}
