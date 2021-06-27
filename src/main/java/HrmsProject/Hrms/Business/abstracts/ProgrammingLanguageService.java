package HrmsProject.Hrms.Business.abstracts;

import HrmsProject.Hrms.Core.utilities.result.DataResult;
import HrmsProject.Hrms.Core.utilities.result.Result;
import HrmsProject.Hrms.Entity.concrete.ProgrammingLanguage;

import java.util.List;

public interface ProgrammingLanguageService {
    Result add(ProgrammingLanguage programmingLanguage);
    DataResult<List<ProgrammingLanguage>>getall();


}
