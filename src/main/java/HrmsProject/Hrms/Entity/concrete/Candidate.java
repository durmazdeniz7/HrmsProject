package HrmsProject.Hrms.Entity.concrete;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "candidates")
@PrimaryKeyJoinColumn(name = "user_id")
@Data
@AllArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "cvTables"})
@NoArgsConstructor
public class Candidate extends User {
    @Column(name = "first_name", nullable = false)
    @NotBlank
    private String firstName;

    @Column(name = "last_name", nullable = false)
    @NotBlank
    private String lastName;

    @Column(name = "identity_number", nullable = false)
    @NotBlank
    @Size(min = 11,max = 11,message = "Lütfen 11 Haneli Tc Kimlik Numararınızı Giriniz")
    private String identityNumber;

    @Column(name = "date_of_birth", nullable = false)
    @NotBlank
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date dateOfBirth;

    @JsonManagedReference
    @OneToMany(mappedBy = "candidate")
    private List<CvTable> cvTables;

}
