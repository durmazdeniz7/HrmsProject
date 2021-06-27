package HrmsProject.Hrms.Entity.concrete;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Date;

@Entity
@Table(name = "schools")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class School {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "school_name",nullable = false)
    @NotBlank
    private String schoolName;

    @Column(name = "department",nullable = false)
    private String department;

    @DateTimeFormat(pattern = "MM-dd-yyyy")
    @Column(name = "start_date",nullable = false)
    private Date startDate;

    @DateTimeFormat(pattern = "MM-dd-yyyy")
    @Column(name = "end_date")
    private Date endDate;

    @DateTimeFormat(pattern = "MM-dd-yyyy")
    @Column(name = "create_date")
    private Date createDate;

    @ManyToOne()
    @JoinColumn(name = "cvTable_id")
    private CvTable cvTable;



}
