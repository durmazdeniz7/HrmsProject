package HrmsProject.Hrms.Entity.concrete;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "schools")
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","School"})
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

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @JsonFormat(pattern = "dd/MM/yyyy")
    @Column(name = "create_date")
    private LocalDate createDate;

    @JsonBackReference
    @ManyToOne()
    @JoinColumn(name = "cvTable_id")
    private CvTable cvTable;

}
