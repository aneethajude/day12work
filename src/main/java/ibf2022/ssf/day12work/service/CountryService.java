package ibf2022.ssf.day12work.service;

import java.util.List;

import ibf2022.ssf.day12work.repository.CountryRepo;
import ibf2022.ssf.day12work.model.Country;

public class CountryService {
    CountryRepo ctyRepo;
    public CountryService(){
        ctyRepo = new CountryRepo();

    }
    public List<Country> getAllCountries() {
        return ctyRepo.getAllCountries();
    }
    public boolean createCountry(Country cty){
        Boolean result = ctyRepo.createCountry(cty);
        return result;
    }
}
