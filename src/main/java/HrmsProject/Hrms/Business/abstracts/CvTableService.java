package HrmsProject.Hrms.Business.abstracts;

import HrmsProject.Hrms.Core.utilities.result.DataResult;
import HrmsProject.Hrms.Core.utilities.result.Result;
import HrmsProject.Hrms.Entity.concrete.CvTable;
import HrmsProject.Hrms.Entity.concrete.dtos.CandidateWithCvTable;

import java.util.List;

public interface CvTableService {
    Result add(CvTable cvTable);
    DataResult<List<CvTable>> getall();

    DataResult<List<CandidateWithCvTable>> getByCandidateWithCvTable(int id);


}
