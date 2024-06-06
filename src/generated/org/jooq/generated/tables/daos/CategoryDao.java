/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated.tables.daos;


import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.jooq.Configuration;
import org.jooq.generated.tables.JCategory;
import org.jooq.generated.tables.pojos.Category;
import org.jooq.generated.tables.records.CategoryRecord;
import org.jooq.impl.DAOImpl;
import org.jooq.types.UByte;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CategoryDao extends DAOImpl<CategoryRecord, Category, UByte> {

    /**
     * Create a new CategoryDao without any configuration
     */
    public CategoryDao() {
        super(JCategory.CATEGORY, Category.class);
    }

    /**
     * Create a new CategoryDao with an attached configuration
     */
    public CategoryDao(Configuration configuration) {
        super(JCategory.CATEGORY, Category.class, configuration);
    }

    @Override
    public UByte getId(Category object) {
        return object.getCategoryId();
    }

    /**
     * Fetch records that have <code>category_id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<Category> fetchRangeOfJCategoryId(UByte lowerInclusive, UByte upperInclusive) {
        return fetchRange(JCategory.CATEGORY.CATEGORY_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>category_id IN (values)</code>
     */
    public List<Category> fetchByJCategoryId(UByte... values) {
        return fetch(JCategory.CATEGORY.CATEGORY_ID, values);
    }

    /**
     * Fetch a unique record that has <code>category_id = value</code>
     */
    public Category fetchOneByJCategoryId(UByte value) {
        return fetchOne(JCategory.CATEGORY.CATEGORY_ID, value);
    }

    /**
     * Fetch a unique record that has <code>category_id = value</code>
     */
    public Optional<Category> fetchOptionalByJCategoryId(UByte value) {
        return fetchOptional(JCategory.CATEGORY.CATEGORY_ID, value);
    }

    /**
     * Fetch records that have <code>name BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<Category> fetchRangeOfJName(String lowerInclusive, String upperInclusive) {
        return fetchRange(JCategory.CATEGORY.NAME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>name IN (values)</code>
     */
    public List<Category> fetchByJName(String... values) {
        return fetch(JCategory.CATEGORY.NAME, values);
    }

    /**
     * Fetch records that have <code>last_update BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<Category> fetchRangeOfJLastUpdate(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(JCategory.CATEGORY.LAST_UPDATE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>last_update IN (values)</code>
     */
    public List<Category> fetchByJLastUpdate(LocalDateTime... values) {
        return fetch(JCategory.CATEGORY.LAST_UPDATE, values);
    }
}
