package HrmsProject.Hrms.Api;

import HrmsProject.Hrms.Business.abstracts.ForeignLanguageService;
import HrmsProject.Hrms.Core.utilities.result.DataResult;
import HrmsProject.Hrms.Core.utilities.result.Result;
import HrmsProject.Hrms.Entity.concrete.ForeignLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/foreignlangugaecontrolles")
public class ForeignLanguageControllers {
    private ForeignLanguageService foreignLanguageService;

    @Autowired
    public ForeignLanguageControllers(ForeignLanguageService foreignLanguageService) {
        this.foreignLanguageService = foreignLanguageService;
    }

    @PostMapping("/add")
    public Result add(ForeignLanguage foreignLanguage){
        return this.foreignLanguageService.add(foreignLanguage);
    }
    @RequestMapping("/getall")
    public DataResult<List<ForeignLanguage>> getall(){
        return this.foreignLanguageService.getall();
    }
}
