package HrmsProject.Hrms.Entity.concrete.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployerWithJobPosting {
   private int id;
    private String companyName;
    private int openPosition;
    private Date publishDate;
    private Date endApplyDate;
}
