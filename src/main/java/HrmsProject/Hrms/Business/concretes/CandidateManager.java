package HrmsProject.Hrms.Business.concretes;

import HrmsProject.Hrms.Business.abstracts.CandidateService;
import HrmsProject.Hrms.Core.utilities.Mail.EmailService;
import HrmsProject.Hrms.Core.utilities.Verification.UserCheckService;
import HrmsProject.Hrms.Core.utilities.result.*;
import HrmsProject.Hrms.DataAcces.abstracts.CandidateDao;
import HrmsProject.Hrms.Entity.concrete.Candidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidateManager implements CandidateService {
    private CandidateDao candidateDao;
    private UserCheckService userCheckService;
   private EmailService emailService;


    @Autowired
    public CandidateManager(CandidateDao candidateDao, UserCheckService userCheckService, EmailService emailService) {
        this.candidateDao = candidateDao;
        this.userCheckService = userCheckService;
        this.emailService = emailService;
    }


    @Override
    public Candidate findByEmail(String email) {
        return this.candidateDao.findByEmail(email);
    }

    @Override
    public Candidate findByIdentityNumber(String identityNumber) {
        return this.candidateDao.findByIdentityNumber(identityNumber);
    }

    @Override
    public Result add(Candidate candidate) {
        if (this.findByEmail(candidate.getEmail()) != null) {
            return new ErrorResult("Daha önce kayıtlı email var");
        }
        if (this.findByIdentityNumber(candidate.getIdentityNumber())!=null){
            return new ErrorResult("Aynı TC KİMLİK NUMARASI VAR");
        }
        if(!userCheckService.isVerified(candidate)){
            return new ErrorResult("Kullanıcı Doğrulanamadı");
        }
        this.emailService.sendMailVerified(candidate.getEmail(),"123456");
        this.candidateDao.save(candidate);
        return new SuccesResult("Eklendi");
    }

    @Override
    public DataResult<List<Candidate>> getall() {
        return new SuccesDataResult<List<Candidate>>(this.candidateDao.findAll(),"Listelendi");
    }

    @Override
    public DataResult<List<Candidate>> getByCandidateName(String firstName) {

        return new SuccesDataResult<>(this.candidateDao.getByCandidateName(firstName));
    }
}
