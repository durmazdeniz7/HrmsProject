package HrmsProject.Hrms.Business.concretes;

import HrmsProject.Hrms.Business.abstracts.ForeignLanguageService;
import HrmsProject.Hrms.Core.utilities.result.DataResult;
import HrmsProject.Hrms.Core.utilities.result.Result;
import HrmsProject.Hrms.Core.utilities.result.SuccesDataResult;
import HrmsProject.Hrms.Core.utilities.result.SuccesResult;
import HrmsProject.Hrms.DataAcces.abstracts.ForeignLanguageDao;
import HrmsProject.Hrms.Entity.concrete.ForeignLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ForeignLanguageManager implements ForeignLanguageService {
    private ForeignLanguageDao foreignLanguageDao;

    @Autowired
    public ForeignLanguageManager(ForeignLanguageDao foreignLanguageDao) {
        this.foreignLanguageDao = foreignLanguageDao;
    }

    @Override
    public Result add(ForeignLanguage foreignLanguage) {
        this.foreignLanguageDao.save(foreignLanguage);
        return new SuccesResult("Ekledni");
    }

    @Override
    public DataResult<List<ForeignLanguage>> getall() {
        return new SuccesDataResult<List<ForeignLanguage>>(this.foreignLanguageDao.findAll(),"Listelendi");
    }
}
