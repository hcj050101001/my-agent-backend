package com.example.backend.message;

import com.example.backend.mask.Mask;
import com.example.backend.session.Session;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
public class Message {

    @Id
    private String id;

    @Column(length = 2000)
    private String content;

    private String role;

    private String date;

    @ManyToOne
    @JoinColumn(name = "mask_id",referencedColumnName = "id")
    @JsonIgnore
    private Mask mask;

    @ManyToOne
    @JoinColumn(name = "session_id",referencedColumnName = "id")
    private Session session;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }

    public Mask getMask() {
        return mask;
    }

    public void setMask(Mask mask) {
        this.mask = mask;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
