package HrmsProject.Hrms.DataAcces.abstracts;

import HrmsProject.Hrms.Entity.concrete.Cities;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CitiesDao extends JpaRepository<Cities,Integer> {
}
