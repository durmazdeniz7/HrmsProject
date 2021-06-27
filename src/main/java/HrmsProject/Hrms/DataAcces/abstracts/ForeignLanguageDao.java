package HrmsProject.Hrms.DataAcces.abstracts;

import HrmsProject.Hrms.Entity.concrete.ForeignLanguage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ForeignLanguageDao extends JpaRepository<ForeignLanguage,Integer> {
}
