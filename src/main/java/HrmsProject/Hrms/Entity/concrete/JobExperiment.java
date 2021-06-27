package HrmsProject.Hrms.Entity.concrete;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "job_experiment")

public class JobExperiment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "workplace_name", nullable = false)
    private String workplaceName;

    @Column(name = "position", nullable = false)
    private String position;

    @Column(name = "started_date",nullable = false)
    private Date startedDate;

    @Column(name = "finish_date")
    private Date finishDate;

    @ManyToOne()
    @JoinColumn(name = "cvTable_id")
    private CvTable cvTable;


}
