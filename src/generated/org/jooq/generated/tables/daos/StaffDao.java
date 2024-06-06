/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated.tables.daos;


import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.jooq.Configuration;
import org.jooq.generated.tables.JStaff;
import org.jooq.generated.tables.pojos.Staff;
import org.jooq.generated.tables.records.StaffRecord;
import org.jooq.impl.DAOImpl;
import org.jooq.types.UByte;
import org.jooq.types.UShort;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class StaffDao extends DAOImpl<StaffRecord, Staff, UByte> {

    /**
     * Create a new StaffDao without any configuration
     */
    public StaffDao() {
        super(JStaff.STAFF, Staff.class);
    }

    /**
     * Create a new StaffDao with an attached configuration
     */
    public StaffDao(Configuration configuration) {
        super(JStaff.STAFF, Staff.class, configuration);
    }

    @Override
    public UByte getId(Staff object) {
        return object.getStaffId();
    }

    /**
     * Fetch records that have <code>staff_id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<Staff> fetchRangeOfJStaffId(UByte lowerInclusive, UByte upperInclusive) {
        return fetchRange(JStaff.STAFF.STAFF_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>staff_id IN (values)</code>
     */
    public List<Staff> fetchByJStaffId(UByte... values) {
        return fetch(JStaff.STAFF.STAFF_ID, values);
    }

    /**
     * Fetch a unique record that has <code>staff_id = value</code>
     */
    public Staff fetchOneByJStaffId(UByte value) {
        return fetchOne(JStaff.STAFF.STAFF_ID, value);
    }

    /**
     * Fetch a unique record that has <code>staff_id = value</code>
     */
    public Optional<Staff> fetchOptionalByJStaffId(UByte value) {
        return fetchOptional(JStaff.STAFF.STAFF_ID, value);
    }

    /**
     * Fetch records that have <code>first_name BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<Staff> fetchRangeOfJFirstName(String lowerInclusive, String upperInclusive) {
        return fetchRange(JStaff.STAFF.FIRST_NAME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>first_name IN (values)</code>
     */
    public List<Staff> fetchByJFirstName(String... values) {
        return fetch(JStaff.STAFF.FIRST_NAME, values);
    }

    /**
     * Fetch records that have <code>last_name BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<Staff> fetchRangeOfJLastName(String lowerInclusive, String upperInclusive) {
        return fetchRange(JStaff.STAFF.LAST_NAME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>last_name IN (values)</code>
     */
    public List<Staff> fetchByJLastName(String... values) {
        return fetch(JStaff.STAFF.LAST_NAME, values);
    }

    /**
     * Fetch records that have <code>address_id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<Staff> fetchRangeOfJAddressId(UShort lowerInclusive, UShort upperInclusive) {
        return fetchRange(JStaff.STAFF.ADDRESS_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>address_id IN (values)</code>
     */
    public List<Staff> fetchByJAddressId(UShort... values) {
        return fetch(JStaff.STAFF.ADDRESS_ID, values);
    }

    /**
     * Fetch records that have <code>picture BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<Staff> fetchRangeOfJPicture(byte[] lowerInclusive, byte[] upperInclusive) {
        return fetchRange(JStaff.STAFF.PICTURE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>picture IN (values)</code>
     */
    public List<Staff> fetchByJPicture(byte[]... values) {
        return fetch(JStaff.STAFF.PICTURE, values);
    }

    /**
     * Fetch records that have <code>email BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<Staff> fetchRangeOfJEmail(String lowerInclusive, String upperInclusive) {
        return fetchRange(JStaff.STAFF.EMAIL, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>email IN (values)</code>
     */
    public List<Staff> fetchByJEmail(String... values) {
        return fetch(JStaff.STAFF.EMAIL, values);
    }

    /**
     * Fetch records that have <code>store_id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<Staff> fetchRangeOfJStoreId(UByte lowerInclusive, UByte upperInclusive) {
        return fetchRange(JStaff.STAFF.STORE_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>store_id IN (values)</code>
     */
    public List<Staff> fetchByJStoreId(UByte... values) {
        return fetch(JStaff.STAFF.STORE_ID, values);
    }

    /**
     * Fetch records that have <code>active BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<Staff> fetchRangeOfJActive(Byte lowerInclusive, Byte upperInclusive) {
        return fetchRange(JStaff.STAFF.ACTIVE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>active IN (values)</code>
     */
    public List<Staff> fetchByJActive(Byte... values) {
        return fetch(JStaff.STAFF.ACTIVE, values);
    }

    /**
     * Fetch records that have <code>username BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<Staff> fetchRangeOfJUsername(String lowerInclusive, String upperInclusive) {
        return fetchRange(JStaff.STAFF.USERNAME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>username IN (values)</code>
     */
    public List<Staff> fetchByJUsername(String... values) {
        return fetch(JStaff.STAFF.USERNAME, values);
    }

    /**
     * Fetch records that have <code>password BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<Staff> fetchRangeOfJPassword(String lowerInclusive, String upperInclusive) {
        return fetchRange(JStaff.STAFF.PASSWORD, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>password IN (values)</code>
     */
    public List<Staff> fetchByJPassword(String... values) {
        return fetch(JStaff.STAFF.PASSWORD, values);
    }

    /**
     * Fetch records that have <code>last_update BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<Staff> fetchRangeOfJLastUpdate(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(JStaff.STAFF.LAST_UPDATE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>last_update IN (values)</code>
     */
    public List<Staff> fetchByJLastUpdate(LocalDateTime... values) {
        return fetch(JStaff.STAFF.LAST_UPDATE, values);
    }
}
