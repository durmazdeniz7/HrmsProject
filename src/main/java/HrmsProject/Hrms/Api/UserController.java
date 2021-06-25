package HrmsProject.Hrms.Api;

import HrmsProject.Hrms.Business.abstracts.UserService;
import HrmsProject.Hrms.Core.utilities.result.DataResult;
import HrmsProject.Hrms.Core.utilities.result.Result;
import HrmsProject.Hrms.Entity.concrete.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/usercontrollers")
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/add")
    public Result add(User user) {
        return this.userService.add(user);
    }

    @RequestMapping("/getall")
    public DataResult<List<User>> getall() {
        return this.userService.getall();
    }


}
