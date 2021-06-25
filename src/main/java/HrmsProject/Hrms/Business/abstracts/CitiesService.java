package HrmsProject.Hrms.Business.abstracts;

import HrmsProject.Hrms.Core.utilities.result.DataResult;
import HrmsProject.Hrms.Entity.concrete.Cities;

import java.util.List;

public interface CitiesService {
    DataResult<List<Cities>> getall();
}
