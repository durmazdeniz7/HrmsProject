package HrmsProject.Hrms.DataAcces.abstracts;

import HrmsProject.Hrms.Entity.concrete.CvTable;
import HrmsProject.Hrms.Entity.concrete.dtos.CandidateWithCvTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CvTableDao extends JpaRepository<CvTable,Integer> {

    @Query("Select new HrmsProject.Hrms.Entity.concrete.dtos.CandidateWithCvTable" +
            "(c.id,c.firstName,c.lastName,cv.photoLink,cv.githubLink,cv.linkedinLink," +
            "cv.description) " +
            "From Candidate c Inner Join c.cvTables cv ")
    List<CandidateWithCvTable> getByCandidateWithCvTable();

/*
,cv.createDate,s.schoolName,s.department,s.startDate,s.endDate,f.languageName,f.level," +
            "j.workplaceName,j.position,j.startedDate,j.finishDate,p.programingName
 */


}
