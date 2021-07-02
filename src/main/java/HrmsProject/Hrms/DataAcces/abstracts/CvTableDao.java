package HrmsProject.Hrms.DataAcces.abstracts;

import HrmsProject.Hrms.Entity.concrete.CvTable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CvTableDao extends JpaRepository<CvTable,Integer> {
    /*
    @Query("Select new HrmsProject.Hrms.Entity.concrete.dtos.CandidateWithCvTable" +
            "(c.id,c.firstName,c.lastName,cv.photoLink,cv.githubLink,cv.linkedinLink," +
            "cv.description,cv.createDate,s.schoolName,s.department,s.startDate,s.endDate,f.languageName,f.level," +
            "j.workplaceName,j.position,j.startedDate,j.finishDate,p.programingName) " +
            "From Candidate c Inner Join c.cvTables cv Inner Join c.schools s " +
            "Inner Join ForeignLanguage f Inner Join JobExperiment j Inner Join ProgrammingLanguage p")
    List<CandidateWithCvTable> getByCandidateWithCvTable();

     */
}
