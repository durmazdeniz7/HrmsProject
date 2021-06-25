package HrmsProject.Hrms.Core.utilities.Mail;

import org.springframework.stereotype.Service;

@Service

public class EmailManager implements EmailService{
    @Override
    public boolean sendMailVerified(String to, String message) {
        return true;
    }
}
