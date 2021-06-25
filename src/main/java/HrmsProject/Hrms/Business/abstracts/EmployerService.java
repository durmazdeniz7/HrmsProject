package HrmsProject.Hrms.Business.abstracts;

import HrmsProject.Hrms.Core.utilities.result.DataResult;
import HrmsProject.Hrms.Core.utilities.result.Result;
import HrmsProject.Hrms.Entity.concrete.Employer;

import java.util.List;

public interface EmployerService {
    Employer findByEmail(String email);
    Result add(Employer employer);
    DataResult<List<Employer>> getall();
}
