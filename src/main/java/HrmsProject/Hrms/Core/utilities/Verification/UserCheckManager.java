package HrmsProject.Hrms.Core.utilities.Verification;

import HrmsProject.Hrms.Entity.concrete.Candidate;
import HrmsProject.Hrms.MernisCheck.MernisCheck;
import org.springframework.stereotype.Service;

@Service
public class UserCheckManager implements UserCheckService {
    @Override
    public boolean isVerified(Candidate candidate) {
        MernisCheck mernisCheck = new MernisCheck();
        return mernisCheck.isVerified(candidate.getFirstName(), candidate.getLastName(), candidate.getIdentityNumber(), candidate.getDateOfBirth());

    }
}
