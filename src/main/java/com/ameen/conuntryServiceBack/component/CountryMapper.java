package com.ameen.conuntryServiceBack.component;

import com.ameen.conuntryServiceBack.model.external.CountryInfo;
import com.ameen.conuntryServiceBack.model.external.internal.Country;
import com.ameen.conuntryServiceBack.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CountryMapper {

    @Autowired
    private CountryService countryService;



    public List<Country> fetchAllCountries() {
        List<CountryInfo> info = countryService.findAllCountries();
        return info
                .stream()
                .map(this::transformToResponse)
                .collect(Collectors.toList());
    }







    public Country fetchCountryByName(String name) {
        List<CountryInfo> info = countryService.findCountryByName(name);
        return transformToResponse(info.get(0));
    }

    private Country transformToResponse(CountryInfo countryInfo) {
        Country country = null;
        if (countryInfo != null) {
            country = new Country();
            country.setName(countryInfo.getName());
            country.setAlpha2Code(countryInfo.getAlpha2Code());
            country.setCapital(countryInfo.getCapital());
            country.setPopulation(countryInfo.getPopulation());
            country.setFlag(countryInfo.getFlag());
        }
        return country;
    }

}
