package HrmsProject.Hrms.Api;

import HrmsProject.Hrms.Business.abstracts.CitiesService;
import HrmsProject.Hrms.Business.abstracts.EmployerService;
import HrmsProject.Hrms.Core.utilities.result.DataResult;
import HrmsProject.Hrms.Core.utilities.result.Result;
import HrmsProject.Hrms.Entity.concrete.Cities;
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
    private CitiesService citiesService;

@Autowired
    public EmployerControllers(EmployerService employerService, CitiesService citiesService) {
        this.employerService = employerService;
    this.citiesService = citiesService;
}
    @PostMapping("/Add")
    public Result add(@RequestBody Employer employer){
    return this.employerService.add(employer);
    }
    @RequestMapping("/getall")
    public DataResult<List<Employer>> getall(){
    return this.employerService.getall();
    }
    @RequestMapping("/getcity")
    public DataResult<List<Cities>> getCity(){
    return this.citiesService.getall();
    }
}
