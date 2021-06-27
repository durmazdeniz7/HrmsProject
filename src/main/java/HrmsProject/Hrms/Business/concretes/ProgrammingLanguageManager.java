package HrmsProject.Hrms.Business.concretes;

import HrmsProject.Hrms.Business.abstracts.ProgrammingLanguageService;
import HrmsProject.Hrms.Core.utilities.result.DataResult;
import HrmsProject.Hrms.Core.utilities.result.Result;
import HrmsProject.Hrms.Core.utilities.result.SuccesDataResult;
import HrmsProject.Hrms.Core.utilities.result.SuccesResult;
import HrmsProject.Hrms.DataAcces.abstracts.ProgrammingLanguageDao;
import HrmsProject.Hrms.Entity.concrete.ProgrammingLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService {
    private ProgrammingLanguageDao programmingLanguageDao;
    @Autowired
    public ProgrammingLanguageManager(ProgrammingLanguageDao programmingLanguageDao) {
        this.programmingLanguageDao = programmingLanguageDao;
    }

    @Override
    public Result add(ProgrammingLanguage programmingLanguage) {
        this.programmingLanguageDao.save(programmingLanguage);
        return new SuccesResult("Eklendi");
    }

    @Override
    public DataResult<List<ProgrammingLanguage>> getall() {
        return new SuccesDataResult<List<ProgrammingLanguage>>(programmingLanguageDao.findAll(), "Listelendi");
    }
}
