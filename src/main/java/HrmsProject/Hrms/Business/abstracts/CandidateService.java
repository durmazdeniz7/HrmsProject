package HrmsProject.Hrms.Business.abstracts;

import HrmsProject.Hrms.Core.utilities.result.DataResult;
import HrmsProject.Hrms.Core.utilities.result.Result;
import HrmsProject.Hrms.Entity.concrete.Candidate;

import java.util.List;

public interface CandidateService {
    Candidate findByEmail(String email);

    Candidate findByIdentityNumber(String identityNumber);

    Result add(Candidate candidate);

    DataResult<List<Candidate>> getall();
}
