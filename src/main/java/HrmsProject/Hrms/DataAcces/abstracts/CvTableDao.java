package HrmsProject.Hrms.DataAcces.abstracts;

import HrmsProject.Hrms.Entity.concrete.CvTable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CvTableDao extends JpaRepository<CvTable,Integer> {
}
