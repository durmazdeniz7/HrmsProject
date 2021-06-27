package HrmsProject.Hrms.Api;

import HrmsProject.Hrms.Business.abstracts.ProgrammingLanguageService;
import HrmsProject.Hrms.Core.utilities.result.DataResult;
import HrmsProject.Hrms.Core.utilities.result.Result;
import HrmsProject.Hrms.Entity.concrete.ProgrammingLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/programminlanguage")
public class ProgrammingLanguageControllers {
    private ProgrammingLanguageService programmingLanguageService;
    @Autowired
    public ProgrammingLanguageControllers(ProgrammingLanguageService programmingLanguageService) {
        this.programmingLanguageService = programmingLanguageService;

    }
    @PostMapping("/add")
    public Result add(ProgrammingLanguage programmingLanguage){
      return this.programmingLanguageService.add(programmingLanguage);
    }
    @RequestMapping("/getall")
    public DataResult<List<ProgrammingLanguage>>getall(){
       return this.programmingLanguageService.getall();
    }
}
