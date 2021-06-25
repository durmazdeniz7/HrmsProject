package HrmsProject.Hrms.Core.utilities.Verification;

import HrmsProject.Hrms.Entity.concrete.Candidate;

public interface UserCheckService {
    boolean isVerified(Candidate candidate);
}
