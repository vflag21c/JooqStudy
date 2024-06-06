/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated.tables;


import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.jooq.Condition;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.InverseForeignKey;
import org.jooq.Name;
import org.jooq.Path;
import org.jooq.PlainSQL;
import org.jooq.QueryPart;
import org.jooq.Record;
import org.jooq.SQL;
import org.jooq.Schema;
import org.jooq.Select;
import org.jooq.Stringly;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.generated.Indexes;
import org.jooq.generated.JSakila;
import org.jooq.generated.Keys;
import org.jooq.generated.tables.JAddress.AddressPath;
import org.jooq.generated.tables.JPayment.PaymentPath;
import org.jooq.generated.tables.JRental.RentalPath;
import org.jooq.generated.tables.JStore.StorePath;
import org.jooq.generated.tables.records.StaffRecord;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;
import org.jooq.types.UByte;
import org.jooq.types.UShort;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JStaff extends TableImpl<StaffRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>sakila.staff</code>
     */
    public static final JStaff STAFF = new JStaff();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<StaffRecord> getRecordType() {
        return StaffRecord.class;
    }

    /**
     * The column <code>sakila.staff.staff_id</code>.
     */
    public final TableField<StaffRecord, UByte> STAFF_ID = createField(DSL.name("staff_id"), SQLDataType.TINYINTUNSIGNED.nullable(false).identity(true), this, "");

    /**
     * The column <code>sakila.staff.first_name</code>.
     */
    public final TableField<StaffRecord, String> FIRST_NAME = createField(DSL.name("first_name"), SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>sakila.staff.last_name</code>.
     */
    public final TableField<StaffRecord, String> LAST_NAME = createField(DSL.name("last_name"), SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>sakila.staff.address_id</code>.
     */
    public final TableField<StaffRecord, UShort> ADDRESS_ID = createField(DSL.name("address_id"), SQLDataType.SMALLINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sakila.staff.picture</code>.
     */
    public final TableField<StaffRecord, byte[]> PICTURE = createField(DSL.name("picture"), SQLDataType.BLOB, this, "");

    /**
     * The column <code>sakila.staff.email</code>.
     */
    public final TableField<StaffRecord, String> EMAIL = createField(DSL.name("email"), SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>sakila.staff.store_id</code>.
     */
    public final TableField<StaffRecord, UByte> STORE_ID = createField(DSL.name("store_id"), SQLDataType.TINYINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sakila.staff.active</code>.
     */
    public final TableField<StaffRecord, Byte> ACTIVE = createField(DSL.name("active"), SQLDataType.TINYINT.nullable(false).defaultValue(DSL.inline("1", SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>sakila.staff.username</code>.
     */
    public final TableField<StaffRecord, String> USERNAME = createField(DSL.name("username"), SQLDataType.VARCHAR(16).nullable(false), this, "");

    /**
     * The column <code>sakila.staff.password</code>.
     */
    public final TableField<StaffRecord, String> PASSWORD = createField(DSL.name("password"), SQLDataType.VARCHAR(40), this, "");

    /**
     * The column <code>sakila.staff.last_update</code>.
     */
    public final TableField<StaffRecord, LocalDateTime> LAST_UPDATE = createField(DSL.name("last_update"), SQLDataType.LOCALDATETIME(0).nullable(false).defaultValue(DSL.field(DSL.raw("CURRENT_TIMESTAMP"), SQLDataType.LOCALDATETIME)), this, "");

    private JStaff(Name alias, Table<StaffRecord> aliased) {
        this(alias, aliased, (Field<?>[]) null, null);
    }

    private JStaff(Name alias, Table<StaffRecord> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table(), where);
    }

    /**
     * Create an aliased <code>sakila.staff</code> table reference
     */
    public JStaff(String alias) {
        this(DSL.name(alias), STAFF);
    }

    /**
     * Create an aliased <code>sakila.staff</code> table reference
     */
    public JStaff(Name alias) {
        this(alias, STAFF);
    }

    /**
     * Create a <code>sakila.staff</code> table reference
     */
    public JStaff() {
        this(DSL.name("staff"), null);
    }

    public <O extends Record> JStaff(Table<O> path, ForeignKey<O, StaffRecord> childPath, InverseForeignKey<O, StaffRecord> parentPath) {
        super(path, childPath, parentPath, STAFF);
    }

    /**
     * A subtype implementing {@link Path} for simplified path-based joins.
     */
    public static class StaffPath extends JStaff implements Path<StaffRecord> {

        private static final long serialVersionUID = 1L;
        public <O extends Record> StaffPath(Table<O> path, ForeignKey<O, StaffRecord> childPath, InverseForeignKey<O, StaffRecord> parentPath) {
            super(path, childPath, parentPath);
        }
        private StaffPath(Name alias, Table<StaffRecord> aliased) {
            super(alias, aliased);
        }

        @Override
        public StaffPath as(String alias) {
            return new StaffPath(DSL.name(alias), this);
        }

        @Override
        public StaffPath as(Name alias) {
            return new StaffPath(alias, this);
        }

        @Override
        public StaffPath as(Table<?> alias) {
            return new StaffPath(alias.getQualifiedName(), this);
        }
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : JSakila.SAKILA;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.STAFF_IDX_FK_ADDRESS_ID, Indexes.STAFF_IDX_FK_STORE_ID);
    }

    @Override
    public Identity<StaffRecord, UByte> getIdentity() {
        return (Identity<StaffRecord, UByte>) super.getIdentity();
    }

    @Override
    public UniqueKey<StaffRecord> getPrimaryKey() {
        return Keys.KEY_STAFF_PRIMARY;
    }

    @Override
    public List<ForeignKey<StaffRecord, ?>> getReferences() {
        return Arrays.asList(Keys.FK_STAFF_ADDRESS, Keys.FK_STAFF_STORE);
    }

    private transient AddressPath _address;

    /**
     * Get the implicit join path to the <code>sakila.address</code> table.
     */
    public AddressPath address() {
        if (_address == null)
            _address = new AddressPath(this, Keys.FK_STAFF_ADDRESS, null);

        return _address;
    }

    private transient StorePath _store;

    /**
     * Get the implicit join path to the <code>sakila.store</code> table.
     */
    public StorePath store() {
        if (_store == null)
            _store = new StorePath(this, Keys.FK_STAFF_STORE, null);

        return _store;
    }

    private transient PaymentPath _payment;

    /**
     * Get the implicit to-many join path to the <code>sakila.payment</code>
     * table
     */
    public PaymentPath payment() {
        if (_payment == null)
            _payment = new PaymentPath(this, null, Keys.FK_PAYMENT_STAFF.getInverseKey());

        return _payment;
    }

    private transient RentalPath _rental;

    /**
     * Get the implicit to-many join path to the <code>sakila.rental</code>
     * table
     */
    public RentalPath rental() {
        if (_rental == null)
            _rental = new RentalPath(this, null, Keys.FK_RENTAL_STAFF.getInverseKey());

        return _rental;
    }

    @Override
    public JStaff as(String alias) {
        return new JStaff(DSL.name(alias), this);
    }

    @Override
    public JStaff as(Name alias) {
        return new JStaff(alias, this);
    }

    @Override
    public JStaff as(Table<?> alias) {
        return new JStaff(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public JStaff rename(String name) {
        return new JStaff(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public JStaff rename(Name name) {
        return new JStaff(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public JStaff rename(Table<?> name) {
        return new JStaff(name.getQualifiedName(), null);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public JStaff where(Condition condition) {
        return new JStaff(getQualifiedName(), aliased() ? this : null, null, condition);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public JStaff where(Collection<? extends Condition> conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public JStaff where(Condition... conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public JStaff where(Field<Boolean> condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public JStaff where(SQL condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public JStaff where(@Stringly.SQL String condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public JStaff where(@Stringly.SQL String condition, Object... binds) {
        return where(DSL.condition(condition, binds));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public JStaff where(@Stringly.SQL String condition, QueryPart... parts) {
        return where(DSL.condition(condition, parts));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public JStaff whereExists(Select<?> select) {
        return where(DSL.exists(select));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public JStaff whereNotExists(Select<?> select) {
        return where(DSL.notExists(select));
    }
}
