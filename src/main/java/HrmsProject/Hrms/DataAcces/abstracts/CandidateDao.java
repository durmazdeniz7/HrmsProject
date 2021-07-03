package HrmsProject.Hrms.DataAcces.abstracts;

import HrmsProject.Hrms.Entity.concrete.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CandidateDao extends JpaRepository<Candidate,Integer> {
    Candidate findByEmail(String email);
    Candidate findByIdentityNumber(String identityNumber);

    @Query("From Candidate where firstName=:firstName")
    List<Candidate> getByCandidateName(String firstName);
}
