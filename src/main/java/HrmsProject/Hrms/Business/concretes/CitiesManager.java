package HrmsProject.Hrms.Business.concretes;

import HrmsProject.Hrms.Business.abstracts.CitiesService;
import HrmsProject.Hrms.Core.utilities.result.DataResult;
import HrmsProject.Hrms.Core.utilities.result.SuccesDataResult;
import HrmsProject.Hrms.DataAcces.abstracts.CitiesDao;
import HrmsProject.Hrms.Entity.concrete.Cities;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CitiesManager implements CitiesService {
private CitiesDao citiesDao;

@Autowired
    public CitiesManager(CitiesDao citiesDao) {
        this.citiesDao = citiesDao;
    }


    @Override
    public DataResult<List<Cities>> getall() {
        return new SuccesDataResult<List<Cities>>(this.citiesDao.findAll(),"Listelendi");
    }
}
