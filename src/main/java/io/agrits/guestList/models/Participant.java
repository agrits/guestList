package io.agrits.guestList.models;


import lombok.Data;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Participant {
    public Participant(){}

    @GeneratedValue
    @Id
    private Long id;

    private String name;

    @ManyToOne(targetEntity = GuestList.class)
    private GuestList guestList;
    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GuestList getGuestList() {
        return guestList;
    }

    public void setGuestList(GuestList guestList) {
        this.guestList = guestList;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}
