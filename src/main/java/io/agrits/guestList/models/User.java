package io.agrits.guestList.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Entity
public class User {
    public User(){}
    @GeneratedValue
    @Id
    private Long id;
    private String username;

    @JsonIgnore
    private String password;

    @OneToMany(mappedBy = "user", targetEntity = GuestList.class)
    private List<GuestList> guestLists;

    @ManyToMany(mappedBy = "editors", targetEntity = GuestList.class)
    private List<GuestList> editable;

    @ManyToMany(mappedBy = "viewers", targetEntity = GuestList.class)
    private List<GuestList> viewable;




    public List<GuestList> getGuestLists() {
        return guestLists;
    }

    public void setGuestLists(List<GuestList> guestLists) {
        this.guestLists = guestLists;
    }

    public List<GuestList> getEditable() {
        return editable;
    }

    public void setEditable(List<GuestList> editable) {
        this.editable = editable;
    }

    public List<GuestList> getViewable() {
        return viewable;
    }

    public void setViewable(List<GuestList> viewable) {
        this.viewable = viewable;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
