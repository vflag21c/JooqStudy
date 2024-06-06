/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated.tables.pojos;


import java.io.Serializable;

import org.jooq.types.UShort;


/**
 * VIEW
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ActorInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    private UShort actorId;
    private String firstName;
    private String lastName;
    private String filmInfo;

    public ActorInfo() {}

    public ActorInfo(ActorInfo value) {
        this.actorId = value.actorId;
        this.firstName = value.firstName;
        this.lastName = value.lastName;
        this.filmInfo = value.filmInfo;
    }

    public ActorInfo(
        UShort actorId,
        String firstName,
        String lastName,
        String filmInfo
    ) {
        this.actorId = actorId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.filmInfo = filmInfo;
    }

    /**
     * Getter for <code>sakila.actor_info.actor_id</code>.
     */
    public UShort getActorId() {
        return this.actorId;
    }

    /**
     * Setter for <code>sakila.actor_info.actor_id</code>.
     */
    public ActorInfo setActorId(UShort actorId) {
        this.actorId = actorId;
        return this;
    }

    /**
     * Getter for <code>sakila.actor_info.first_name</code>.
     */
    public String getFirstName() {
        return this.firstName;
    }

    /**
     * Setter for <code>sakila.actor_info.first_name</code>.
     */
    public ActorInfo setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    /**
     * Getter for <code>sakila.actor_info.last_name</code>.
     */
    public String getLastName() {
        return this.lastName;
    }

    /**
     * Setter for <code>sakila.actor_info.last_name</code>.
     */
    public ActorInfo setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    /**
     * Getter for <code>sakila.actor_info.film_info</code>.
     */
    public String getFilmInfo() {
        return this.filmInfo;
    }

    /**
     * Setter for <code>sakila.actor_info.film_info</code>.
     */
    public ActorInfo setFilmInfo(String filmInfo) {
        this.filmInfo = filmInfo;
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final ActorInfo other = (ActorInfo) obj;
        if (this.actorId == null) {
            if (other.actorId != null)
                return false;
        }
        else if (!this.actorId.equals(other.actorId))
            return false;
        if (this.firstName == null) {
            if (other.firstName != null)
                return false;
        }
        else if (!this.firstName.equals(other.firstName))
            return false;
        if (this.lastName == null) {
            if (other.lastName != null)
                return false;
        }
        else if (!this.lastName.equals(other.lastName))
            return false;
        if (this.filmInfo == null) {
            if (other.filmInfo != null)
                return false;
        }
        else if (!this.filmInfo.equals(other.filmInfo))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.actorId == null) ? 0 : this.actorId.hashCode());
        result = prime * result + ((this.firstName == null) ? 0 : this.firstName.hashCode());
        result = prime * result + ((this.lastName == null) ? 0 : this.lastName.hashCode());
        result = prime * result + ((this.filmInfo == null) ? 0 : this.filmInfo.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ActorInfo (");

        sb.append(actorId);
        sb.append(", ").append(firstName);
        sb.append(", ").append(lastName);
        sb.append(", ").append(filmInfo);

        sb.append(")");
        return sb.toString();
    }
}
