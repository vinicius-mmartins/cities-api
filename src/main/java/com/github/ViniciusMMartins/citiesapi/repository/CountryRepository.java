package com.github.ViniciusMMartins.citiesapi.repository;

import com.github.ViniciusMMartins.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
