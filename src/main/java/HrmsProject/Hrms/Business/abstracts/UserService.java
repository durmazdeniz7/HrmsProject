package HrmsProject.Hrms.Business.abstracts;

import HrmsProject.Hrms.Core.utilities.result.DataResult;
import HrmsProject.Hrms.Core.utilities.result.Result;
import HrmsProject.Hrms.Entity.concrete.User;

import java.util.List;

public interface UserService {
    Result add(User user);
    DataResult<List<User>> getall();

}
