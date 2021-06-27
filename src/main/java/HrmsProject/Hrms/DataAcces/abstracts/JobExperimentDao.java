package HrmsProject.Hrms.DataAcces.abstracts;

import HrmsProject.Hrms.Entity.concrete.JobExperiment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobExperimentDao extends JpaRepository<JobExperiment,Integer> {
}
