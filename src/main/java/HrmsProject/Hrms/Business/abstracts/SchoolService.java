package HrmsProject.Hrms.Business.abstracts;

import HrmsProject.Hrms.Core.utilities.result.DataResult;
import HrmsProject.Hrms.Core.utilities.result.Result;
import HrmsProject.Hrms.Entity.concrete.School;

import java.util.List;

public interface SchoolService {
    Result add(School school);
    DataResult<List<School>> getall();
}
