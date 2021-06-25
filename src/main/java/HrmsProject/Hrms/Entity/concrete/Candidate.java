package HrmsProject.Hrms.Entity.concrete;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import java.util.Date;

@Entity
@Table(name = "candidates")
@PrimaryKeyJoinColumn(name = "user_id")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Candidate extends User{
    @Column(name = "first_name",nullable = false)
    @NotBlank
    private String firstName;

    @Column(name = "last_name",nullable = false)
    @NotBlank
    private String lastName;

    @Column(name = "identity_number",nullable = false)
    @NotBlank
    private String identityNumber;

    @Column(name = "date_of_birth",nullable = false)
    @NotBlank
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date dateOfBirth;


}
