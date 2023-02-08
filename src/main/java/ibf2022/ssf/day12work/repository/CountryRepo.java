package ibf2022.ssf.day12work.repository;
import ibf2022.ssf.day12work.model.Country;

import java.util.ArrayList;
import java.util.List;

public class CountryRepo {

    List<Country> countryList;

    public List<Country> getAllCountries(){

        countryList = new ArrayList<Country>();
        Country cty = new Country("SG","Singapore",6000000);
        countryList.add(cty);
        cty = new Country("MY","Malaysia",33000000);
        countryList.add(cty);
        cty = new Country("CN","China",143000000);
        countryList.add(cty);
        cty = new Country("HK","Hong Kong",7000000);
        countryList.add(cty);


        return countryList;

    }
    public boolean createCountry(Country cty){
        
        if(countryList==null){
            countryList = new ArrayList<Country>();
        }
        countryList.add(cty);
        return true;

    }
    
}
