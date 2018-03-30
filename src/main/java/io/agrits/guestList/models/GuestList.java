package io.agrits.guestList.models;

import lombok.ToString;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Entity
public class GuestList {
    public GuestList(){}
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private Date date;
    private String description;

    @ManyToOne(targetEntity = User.class)
    private User user;

    @ManyToMany
    private List<User> editors;

    @ManyToMany
    private List<User> viewers;

    @OneToMany(mappedBy = "guestList", targetEntity = Participant.class)
    private List<Participant> participants;

    public List<User> getEditors() {
        return editors;
    }

    public void setEditors(List<User> editors) {
        this.editors = editors;
    }

    public List<User> getViewers() {
        return viewers;
    }

    public void setViewers(List<User> viewers) {
        this.viewers = viewers;
    }

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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Participant> getParticipants() {
        return participants;
    }

    public void setParticipants(List<Participant> participants) {
        this.participants = participants;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
