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
import org.jooq.generated.tables.records.StaffListRecord;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;
import org.jooq.types.UByte;


/**
 * VIEW
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JStaffList extends TableImpl<StaffListRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>sakila.staff_list</code>
     */
    public static final JStaffList STAFF_LIST = new JStaffList();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<StaffListRecord> getRecordType() {
        return StaffListRecord.class;
    }

    /**
     * The column <code>sakila.staff_list.ID</code>.
     */
    public final TableField<StaffListRecord, UByte> ID = createField(DSL.name("ID"), SQLDataType.TINYINTUNSIGNED.nullable(false).defaultValue(DSL.inline("0", SQLDataType.TINYINTUNSIGNED)), this, "");

    /**
     * The column <code>sakila.staff_list.name</code>.
     */
    public final TableField<StaffListRecord, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR(91), this, "");

    /**
     * The column <code>sakila.staff_list.address</code>.
     */
    public final TableField<StaffListRecord, String> ADDRESS = createField(DSL.name("address"), SQLDataType.VARCHAR(50).nullable(false), this, "");

    /**
     * The column <code>sakila.staff_list.zip code</code>.
     */
    public final TableField<StaffListRecord, String> ZIP_CODE = createField(DSL.name("zip code"), SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>sakila.staff_list.phone</code>.
     */
    public final TableField<StaffListRecord, String> PHONE = createField(DSL.name("phone"), SQLDataType.VARCHAR(20).nullable(false), this, "");

    /**
     * The column <code>sakila.staff_list.city</code>.
     */
    public final TableField<StaffListRecord, String> CITY = createField(DSL.name("city"), SQLDataType.VARCHAR(50).nullable(false), this, "");

    /**
     * The column <code>sakila.staff_list.country</code>.
     */
    public final TableField<StaffListRecord, String> COUNTRY = createField(DSL.name("country"), SQLDataType.VARCHAR(50).nullable(false), this, "");

    /**
     * The column <code>sakila.staff_list.SID</code>.
     */
    public final TableField<StaffListRecord, UByte> SID = createField(DSL.name("SID"), SQLDataType.TINYINTUNSIGNED.nullable(false), this, "");

    private JStaffList(Name alias, Table<StaffListRecord> aliased) {
        this(alias, aliased, (Field<?>[]) null, null);
    }

    private JStaffList(Name alias, Table<StaffListRecord> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"), TableOptions.view("create view `staff_list` as select `s`.`staff_id` AS `ID`,concat(`s`.`first_name`,' ',`s`.`last_name`) AS `name`,`a`.`address` AS `address`,`a`.`postal_code` AS `zip code`,`a`.`phone` AS `phone`,`sakila`.`city`.`city` AS `city`,`sakila`.`country`.`country` AS `country`,`s`.`store_id` AS `SID` from (((`sakila`.`staff` `s` join `sakila`.`address` `a` on((`s`.`address_id` = `a`.`address_id`))) join `sakila`.`city` on((`a`.`city_id` = `sakila`.`city`.`city_id`))) join `sakila`.`country` on((`sakila`.`city`.`country_id` = `sakila`.`country`.`country_id`)))"), where);
    }

    /**
     * Create an aliased <code>sakila.staff_list</code> table reference
     */
    public JStaffList(String alias) {
        this(DSL.name(alias), STAFF_LIST);
    }

    /**
     * Create an aliased <code>sakila.staff_list</code> table reference
     */
    public JStaffList(Name alias) {
        this(alias, STAFF_LIST);
    }

    /**
     * Create a <code>sakila.staff_list</code> table reference
     */
    public JStaffList() {
        this(DSL.name("staff_list"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : JSakila.SAKILA;
    }

    @Override
    public JStaffList as(String alias) {
        return new JStaffList(DSL.name(alias), this);
    }

    @Override
    public JStaffList as(Name alias) {
        return new JStaffList(alias, this);
    }

    @Override
    public JStaffList as(Table<?> alias) {
        return new JStaffList(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public JStaffList rename(String name) {
        return new JStaffList(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public JStaffList rename(Name name) {
        return new JStaffList(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public JStaffList rename(Table<?> name) {
        return new JStaffList(name.getQualifiedName(), null);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public JStaffList where(Condition condition) {
        return new JStaffList(getQualifiedName(), aliased() ? this : null, null, condition);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public JStaffList where(Collection<? extends Condition> conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public JStaffList where(Condition... conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public JStaffList where(Field<Boolean> condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public JStaffList where(SQL condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public JStaffList where(@Stringly.SQL String condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public JStaffList where(@Stringly.SQL String condition, Object... binds) {
        return where(DSL.condition(condition, binds));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public JStaffList where(@Stringly.SQL String condition, QueryPart... parts) {
        return where(DSL.condition(condition, parts));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public JStaffList whereExists(Select<?> select) {
        return where(DSL.exists(select));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public JStaffList whereNotExists(Select<?> select) {
        return where(DSL.notExists(select));
    }
}
