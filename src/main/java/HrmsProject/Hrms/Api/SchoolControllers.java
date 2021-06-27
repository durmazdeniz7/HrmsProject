package HrmsProject.Hrms.Api;

import HrmsProject.Hrms.Business.abstracts.SchoolService;
import HrmsProject.Hrms.Core.utilities.result.DataResult;
import HrmsProject.Hrms.Core.utilities.result.Result;
import HrmsProject.Hrms.Entity.concrete.School;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/schoolControllers")
public class SchoolControllers {
    private SchoolService schoolService;

    @Autowired
    public SchoolControllers(SchoolService schoolService) {
        this.schoolService = schoolService;
    }
    @RequestMapping("/getall")
    public DataResult<List<School>> getall(){
        return this.schoolService.getall();
    }
    @PostMapping("/Add")
    public Result add(School school){
        return this.schoolService.add(school);
    }

    @RequestMapping("/getallSorted")
    public DataResult<List<School>> getallSorted(){
        return this.schoolService.getallSorted();
    }
}
