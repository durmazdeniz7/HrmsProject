package HrmsProject.Hrms.Entity.concrete.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CandidateWithCvTable {

    private int id;
    //private int cvTableId;
    private String firstName;
    private String lastName;
    private  String photoLink;
    private String githubLink;
    private String linkedinLink;
    private String description;
    private Date createDate;

    /*
    private String createDate;
    private String schoolName;
    private String department;
    private Date startDate;
    private Date endDate;
    private String languageName;
    private int level;
    private String workplaceName;
    private String position;
    private LocalDate startedDate;
    private LocalDate finishDate;
    private String programingName;
     */


}