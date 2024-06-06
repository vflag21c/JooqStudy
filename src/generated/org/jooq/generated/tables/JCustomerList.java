/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated.tables;


import java.util.Collection;

import org.jooq.Condition;
import org.jooq.Field;
import org.jooq.Name;
import org.jooq.PlainSQL;
import org.jooq.QueryPart;
import org.jooq.SQL;
import org.jooq.Schema;
import org.jooq.Select;
import org.jooq.Stringly;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.generated.JSakila;
import org.jooq.generated.tables.records.CustomerListRecord;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;
import org.jooq.types.UByte;
import org.jooq.types.UShort;


/**
 * VIEW
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JCustomerList extends TableImpl<CustomerListRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>sakila.customer_list</code>
     */
    public static final JCustomerList CUSTOMER_LIST = new JCustomerList();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CustomerListRecord> getRecordType() {
        return CustomerListRecord.class;
    }

    /**
     * The column <code>sakila.customer_list.ID</code>.
     */
    public final TableField<CustomerListRecord, UShort> ID = createField(DSL.name("ID"), SQLDataType.SMALLINTUNSIGNED.nullable(false).defaultValue(DSL.inline("0", SQLDataType.SMALLINTUNSIGNED)), this, "");

    /**
     * The column <code>sakila.customer_list.name</code>.
     */
    public final TableField<CustomerListRecord, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR(91), this, "");

    /**
     * The column <code>sakila.customer_list.address</code>.
     */
    public final TableField<CustomerListRecord, String> ADDRESS = createField(DSL.name("address"), SQLDataType.VARCHAR(50).nullable(false), this, "");

    /**
     * The column <code>sakila.customer_list.zip code</code>.
     */
    public final TableField<CustomerListRecord, String> ZIP_CODE = createField(DSL.name("zip code"), SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>sakila.customer_list.phone</code>.
     */
    public final TableField<CustomerListRecord, String> PHONE = createField(DSL.name("phone"), SQLDataType.VARCHAR(20).nullable(false), this, "");

    /**
     * The column <code>sakila.customer_list.city</code>.
     */
    public final TableField<CustomerListRecord, String> CITY = createField(DSL.name("city"), SQLDataType.VARCHAR(50).nullable(false), this, "");

    /**
     * The column <code>sakila.customer_list.country</code>.
     */
    public final TableField<CustomerListRecord, String> COUNTRY = createField(DSL.name("country"), SQLDataType.VARCHAR(50).nullable(false), this, "");

    /**
     * The column <code>sakila.customer_list.notes</code>.
     */
    public final TableField<CustomerListRecord, String> NOTES = createField(DSL.name("notes"), SQLDataType.VARCHAR(6).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>sakila.customer_list.SID</code>.
     */
    public final TableField<CustomerListRecord, UByte> SID = createField(DSL.name("SID"), SQLDataType.TINYINTUNSIGNED.nullable(false), this, "");

    private JCustomerList(Name alias, Table<CustomerListRecord> aliased) {
        this(alias, aliased, (Field<?>[]) null, null);
    }

    private JCustomerList(Name alias, Table<CustomerListRecord> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"), TableOptions.view("create view `customer_list` as select `cu`.`customer_id` AS `ID`,concat(`cu`.`first_name`,' ',`cu`.`last_name`) AS `name`,`a`.`address` AS `address`,`a`.`postal_code` AS `zip code`,`a`.`phone` AS `phone`,`sakila`.`city`.`city` AS `city`,`sakila`.`country`.`country` AS `country`,if(`cu`.`active`,'active','') AS `notes`,`cu`.`store_id` AS `SID` from (((`sakila`.`customer` `cu` join `sakila`.`address` `a` on((`cu`.`address_id` = `a`.`address_id`))) join `sakila`.`city` on((`a`.`city_id` = `sakila`.`city`.`city_id`))) join `sakila`.`country` on((`sakila`.`city`.`country_id` = `sakila`.`country`.`country_id`)))"), where);
    }

    /**
     * Create an aliased <code>sakila.customer_list</code> table reference
     */
    public JCustomerList(String alias) {
        this(DSL.name(alias), CUSTOMER_LIST);
    }

    /**
     * Create an aliased <code>sakila.customer_list</code> table reference
     */
    public JCustomerList(Name alias) {
        this(alias, CUSTOMER_LIST);
    }

    /**
     * Create a <code>sakila.customer_list</code> table reference
     */
    public JCustomerList() {
        this(DSL.name("customer_list"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : JSakila.SAKILA;
    }

    @Override
    public JCustomerList as(String alias) {
        return new JCustomerList(DSL.name(alias), this);
    }

    @Override
    public JCustomerList as(Name alias) {
        return new JCustomerList(alias, this);
    }

    @Override
    public JCustomerList as(Table<?> alias) {
        return new JCustomerList(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public JCustomerList rename(String name) {
        return new JCustomerList(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public JCustomerList rename(Name name) {
        return new JCustomerList(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public JCustomerList rename(Table<?> name) {
        return new JCustomerList(name.getQualifiedName(), null);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public JCustomerList where(Condition condition) {
        return new JCustomerList(getQualifiedName(), aliased() ? this : null, null, condition);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public JCustomerList where(Collection<? extends Condition> conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public JCustomerList where(Condition... conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public JCustomerList where(Field<Boolean> condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public JCustomerList where(SQL condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public JCustomerList where(@Stringly.SQL String condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public JCustomerList where(@Stringly.SQL String condition, Object... binds) {
        return where(DSL.condition(condition, binds));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public JCustomerList where(@Stringly.SQL String condition, QueryPart... parts) {
        return where(DSL.condition(condition, parts));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public JCustomerList whereExists(Select<?> select) {
        return where(DSL.exists(select));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public JCustomerList whereNotExists(Select<?> select) {
        return where(DSL.notExists(select));
    }
}
