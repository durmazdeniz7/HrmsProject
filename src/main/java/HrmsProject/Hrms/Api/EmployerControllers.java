package HrmsProject.Hrms.Api;

import HrmsProject.Hrms.Business.abstracts.EmployerService;
import HrmsProject.Hrms.Core.utilities.result.DataResult;
import HrmsProject.Hrms.Core.utilities.result.Result;
import HrmsProject.Hrms.Entity.concrete.Employer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/EmployerControllers")
public class EmployerControllers {
    private EmployerService employerService;

@Autowired
    public EmployerControllers(EmployerService employerService) {
        this.employerService = employerService;
    }
    @PostMapping("/Add")
    public Result add(@RequestBody Employer employer){
    return this.employerService.add(employer);
    }
    @RequestMapping("/getall")
    public DataResult<List<Employer>> getall(){
    return this.employerService.getall();
    }
}
