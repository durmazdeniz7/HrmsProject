package HrmsProject.Hrms.Business.concretes;

import HrmsProject.Hrms.Business.abstracts.CvTableService;
import HrmsProject.Hrms.Core.utilities.result.DataResult;
import HrmsProject.Hrms.Core.utilities.result.Result;
import HrmsProject.Hrms.Core.utilities.result.SuccesDataResult;
import HrmsProject.Hrms.Core.utilities.result.SuccesResult;
import HrmsProject.Hrms.DataAcces.abstracts.CvTableDao;
import HrmsProject.Hrms.Entity.concrete.CvTable;
import HrmsProject.Hrms.Entity.concrete.dtos.CandidateWithCvTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CvTableManager implements CvTableService {
private CvTableDao cvTableDao;


@Autowired
    public CvTableManager(CvTableDao cvTableDao) {
        this.cvTableDao = cvTableDao;
    }

    @Override
    public Result add(CvTable cvTable) {
    this.cvTableDao.save(cvTable);
        return new SuccesResult("Cv Eklendi");
    }

    @Override
    public DataResult<List<CvTable>> getall() {
        return new SuccesDataResult<List<CvTable>>(this.cvTableDao.findAll(),"Listelendi");
    }


    @Override
    public DataResult<List<CandidateWithCvTable>> getByCandidateWithCvTable(int id) {
        return new SuccesDataResult<List<CandidateWithCvTable>>(this.cvTableDao.getByCandidateWithCvTable(id),"Listelendi");
    }


}
