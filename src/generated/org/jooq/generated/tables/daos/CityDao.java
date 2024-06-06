/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated.tables.daos;


import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.jooq.Configuration;
import org.jooq.generated.tables.JCity;
import org.jooq.generated.tables.pojos.City;
import org.jooq.generated.tables.records.CityRecord;
import org.jooq.impl.DAOImpl;
import org.jooq.types.UShort;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CityDao extends DAOImpl<CityRecord, City, UShort> {

    /**
     * Create a new CityDao without any configuration
     */
    public CityDao() {
        super(JCity.CITY, City.class);
    }

    /**
     * Create a new CityDao with an attached configuration
     */
    public CityDao(Configuration configuration) {
        super(JCity.CITY, City.class, configuration);
    }

    @Override
    public UShort getId(City object) {
        return object.getCityId();
    }

    /**
     * Fetch records that have <code>city_id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<City> fetchRangeOfJCityId(UShort lowerInclusive, UShort upperInclusive) {
        return fetchRange(JCity.CITY.CITY_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>city_id IN (values)</code>
     */
    public List<City> fetchByJCityId(UShort... values) {
        return fetch(JCity.CITY.CITY_ID, values);
    }

    /**
     * Fetch a unique record that has <code>city_id = value</code>
     */
    public City fetchOneByJCityId(UShort value) {
        return fetchOne(JCity.CITY.CITY_ID, value);
    }

    /**
     * Fetch a unique record that has <code>city_id = value</code>
     */
    public Optional<City> fetchOptionalByJCityId(UShort value) {
        return fetchOptional(JCity.CITY.CITY_ID, value);
    }

    /**
     * Fetch records that have <code>city BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<City> fetchRangeOfJCity(String lowerInclusive, String upperInclusive) {
        return fetchRange(JCity.CITY.CITY_, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>city IN (values)</code>
     */
    public List<City> fetchByJCity(String... values) {
        return fetch(JCity.CITY.CITY_, values);
    }

    /**
     * Fetch records that have <code>country_id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<City> fetchRangeOfJCountryId(UShort lowerInclusive, UShort upperInclusive) {
        return fetchRange(JCity.CITY.COUNTRY_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>country_id IN (values)</code>
     */
    public List<City> fetchByJCountryId(UShort... values) {
        return fetch(JCity.CITY.COUNTRY_ID, values);
    }

    /**
     * Fetch records that have <code>last_update BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<City> fetchRangeOfJLastUpdate(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(JCity.CITY.LAST_UPDATE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>last_update IN (values)</code>
     */
    public List<City> fetchByJLastUpdate(LocalDateTime... values) {
        return fetch(JCity.CITY.LAST_UPDATE, values);
    }
}
