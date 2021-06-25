package HrmsProject.Hrms.Entity.concrete;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "system_staff")
@PrimaryKeyJoinColumn(name = "user_id")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SystemStaff extends User {
    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name",nullable = false)
    private String lastName;

}
