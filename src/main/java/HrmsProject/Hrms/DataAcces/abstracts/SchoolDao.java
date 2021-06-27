package HrmsProject.Hrms.DataAcces.abstracts;

import HrmsProject.Hrms.Entity.concrete.School;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolDao extends JpaRepository<School,Integer> {
}
