package HrmsProject.Hrms.Entity.concrete;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "employers")
@Data
@AllArgsConstructor
@NoArgsConstructor
@PrimaryKeyJoinColumn(name = "user_id")
public class Employer extends User{
    @Column(name = "company_name",nullable = false)
    @NotBlank
    private String companyName;

    @Column(name = "web_site",nullable = false)
    @NotBlank
    private String website;

    @Column(name = "phone_number",nullable = false)
    @NotBlank
    @Size(min = 10)
    private String phoneNumber;
}
