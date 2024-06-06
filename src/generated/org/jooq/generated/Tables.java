/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated;


import org.jooq.generated.tables.JActor;
import org.jooq.generated.tables.JActorInfo;
import org.jooq.generated.tables.JAddress;
import org.jooq.generated.tables.JCategory;
import org.jooq.generated.tables.JCity;
import org.jooq.generated.tables.JCountry;
import org.jooq.generated.tables.JCustomer;
import org.jooq.generated.tables.JCustomerList;
import org.jooq.generated.tables.JFilm;
import org.jooq.generated.tables.JFilmActor;
import org.jooq.generated.tables.JFilmCategory;
import org.jooq.generated.tables.JFilmList;
import org.jooq.generated.tables.JFilmText;
import org.jooq.generated.tables.JInventory;
import org.jooq.generated.tables.JLanguage;
import org.jooq.generated.tables.JNicerButSlowerFilmList;
import org.jooq.generated.tables.JPayment;
import org.jooq.generated.tables.JRental;
import org.jooq.generated.tables.JSalesByFilmCategory;
import org.jooq.generated.tables.JSalesByStore;
import org.jooq.generated.tables.JStaff;
import org.jooq.generated.tables.JStaffList;
import org.jooq.generated.tables.JStore;


/**
 * Convenience access to all tables in sakila.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>sakila.actor</code>.
     */
    public static final JActor ACTOR = JActor.ACTOR;

    /**
     * VIEW
     */
    public static final JActorInfo ACTOR_INFO = JActorInfo.ACTOR_INFO;

    /**
     * The table <code>sakila.address</code>.
     */
    public static final JAddress ADDRESS = JAddress.ADDRESS;

    /**
     * The table <code>sakila.category</code>.
     */
    public static final JCategory CATEGORY = JCategory.CATEGORY;

    /**
     * The table <code>sakila.city</code>.
     */
    public static final JCity CITY = JCity.CITY;

    /**
     * The table <code>sakila.country</code>.
     */
    public static final JCountry COUNTRY = JCountry.COUNTRY;

    /**
     * The table <code>sakila.customer</code>.
     */
    public static final JCustomer CUSTOMER = JCustomer.CUSTOMER;

    /**
     * VIEW
     */
    public static final JCustomerList CUSTOMER_LIST = JCustomerList.CUSTOMER_LIST;

    /**
     * The table <code>sakila.film</code>.
     */
    public static final JFilm FILM = JFilm.FILM;

    /**
     * The table <code>sakila.film_actor</code>.
     */
    public static final JFilmActor FILM_ACTOR = JFilmActor.FILM_ACTOR;

    /**
     * The table <code>sakila.film_category</code>.
     */
    public static final JFilmCategory FILM_CATEGORY = JFilmCategory.FILM_CATEGORY;

    /**
     * VIEW
     */
    public static final JFilmList FILM_LIST = JFilmList.FILM_LIST;

    /**
     * The table <code>sakila.film_text</code>.
     */
    public static final JFilmText FILM_TEXT = JFilmText.FILM_TEXT;

    /**
     * The table <code>sakila.inventory</code>.
     */
    public static final JInventory INVENTORY = JInventory.INVENTORY;

    /**
     * The table <code>sakila.language</code>.
     */
    public static final JLanguage LANGUAGE = JLanguage.LANGUAGE;

    /**
     * VIEW
     */
    public static final JNicerButSlowerFilmList NICER_BUT_SLOWER_FILM_LIST = JNicerButSlowerFilmList.NICER_BUT_SLOWER_FILM_LIST;

    /**
     * The table <code>sakila.payment</code>.
     */
    public static final JPayment PAYMENT = JPayment.PAYMENT;

    /**
     * The table <code>sakila.rental</code>.
     */
    public static final JRental RENTAL = JRental.RENTAL;

    /**
     * VIEW
     */
    public static final JSalesByFilmCategory SALES_BY_FILM_CATEGORY = JSalesByFilmCategory.SALES_BY_FILM_CATEGORY;

    /**
     * VIEW
     */
    public static final JSalesByStore SALES_BY_STORE = JSalesByStore.SALES_BY_STORE;

    /**
     * The table <code>sakila.staff</code>.
     */
    public static final JStaff STAFF = JStaff.STAFF;

    /**
     * VIEW
     */
    public static final JStaffList STAFF_LIST = JStaffList.STAFF_LIST;

    /**
     * The table <code>sakila.store</code>.
     */
    public static final JStore STORE = JStore.STORE;
}
