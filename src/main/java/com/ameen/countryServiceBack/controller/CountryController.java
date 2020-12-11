package com.ameen.countryServiceBack.controller;

import com.ameen.countryServiceBack.component.CountryMapper;
import com.ameen.countryServiceBack.model.external.internal.Countries;
import com.ameen.countryServiceBack.model.external.internal.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import static org.springframework.http.ResponseEntity.ok;



@RestController
@RequestMapping("/")
public class CountryController {

    @Autowired
    private CountryMapper countryMapper;


    @GetMapping("/countries")
    public ResponseEntity<Countries> getAllCountries() {
        List<Country> countryList = countryMapper.fetchAllCountries();
        Countries countries = new Countries();
        countries.setCountries(countryList);
        return ok(countries);
    }







    @GetMapping("/countries/{name}")
    public ResponseEntity<Country> getCountryByName(@PathVariable("name") String name) {
        Country country = countryMapper.fetchCountryByName(name);
        return ok(country);
    }
}
