/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated.tables.records;


import java.time.LocalDateTime;

import org.jooq.Record1;
import org.jooq.generated.tables.JActor;
import org.jooq.generated.tables.pojos.Actor;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UShort;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ActorRecord extends UpdatableRecordImpl<ActorRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>sakila.actor.actor_id</code>.
     */
    public ActorRecord setActorId(UShort value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>sakila.actor.actor_id</code>.
     */
    public UShort getActorId() {
        return (UShort) get(0);
    }

    /**
     * Setter for <code>sakila.actor.first_name</code>.
     */
    public ActorRecord setFirstName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>sakila.actor.first_name</code>.
     */
    public String getFirstName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>sakila.actor.last_name</code>.
     */
    public ActorRecord setLastName(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>sakila.actor.last_name</code>.
     */
    public String getLastName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>sakila.actor.last_update</code>.
     */
    public ActorRecord setLastUpdate(LocalDateTime value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>sakila.actor.last_update</code>.
     */
    public LocalDateTime getLastUpdate() {
        return (LocalDateTime) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<UShort> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ActorRecord
     */
    public ActorRecord() {
        super(JActor.ACTOR);
    }

    /**
     * Create a detached, initialised ActorRecord
     */
    public ActorRecord(UShort actorId, String firstName, String lastName, LocalDateTime lastUpdate) {
        super(JActor.ACTOR);

        setActorId(actorId);
        setFirstName(firstName);
        setLastName(lastName);
        setLastUpdate(lastUpdate);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised ActorRecord
     */
    public ActorRecord(Actor value) {
        super(JActor.ACTOR);

        if (value != null) {
            setActorId(value.getActorId());
            setFirstName(value.getFirstName());
            setLastName(value.getLastName());
            setLastUpdate(value.getLastUpdate());
            resetChangedOnNotNull();
        }
    }
}
