package HrmsProject.Hrms.Api;

import HrmsProject.Hrms.Business.abstracts.CvTableService;
import HrmsProject.Hrms.Core.utilities.result.DataResult;
import HrmsProject.Hrms.Core.utilities.result.Result;
import HrmsProject.Hrms.Entity.concrete.CvTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(name = "/api/cv_table")
public class CvTableControllers {
    private CvTableService cvTableService;

    @Autowired
    public CvTableControllers(CvTableService cvTableService) {
        this.cvTableService = cvTableService;
    }

    @PostMapping("/add")
    public Result add(CvTable cvTable) {
        return this.cvTableService.add(cvTable);

    }

    @RequestMapping("/getall")
    public DataResult<List<CvTable>> getall() {
        return this.cvTableService.getall();
    }

    /*
    @RequestMapping("/getByCandidateWithCvTable")
    public DataResult<List<CandidateWithCvTable>> getByCandidateWithCvTable() {
        return this.cvTableService.getByCandidateWithCvTable();
    }

     */
}
