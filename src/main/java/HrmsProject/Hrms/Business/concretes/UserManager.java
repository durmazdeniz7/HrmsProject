package HrmsProject.Hrms.Business.concretes;

import HrmsProject.Hrms.Business.abstracts.UserService;
import HrmsProject.Hrms.Core.utilities.result.*;
import HrmsProject.Hrms.DataAcces.abstracts.UserDao;
import HrmsProject.Hrms.Entity.concrete.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserManager implements UserService {
    @Autowired
    public UserManager(UserDao userDao) {
        this.userDao = userDao;
    }

    private UserDao userDao;

    @Override
    public Result add(User user) {
        if(this.findByEmail(user.getEmail())!=null){
            return  new ErrorResult("Aynı Email Var");
        }
        this.userDao.save(user);
        return new SuccesResult("Kullanıcı Eklendi");
    }

    @Override
    public DataResult<List<User>> getall() {
        return new SuccesDataResult<List<User>>(this.userDao.findAll(),"Listelendi");
    }

    @Override
    public User findByEmail(String email) {
        return  this.userDao.findByEmail(email);
    }
}
