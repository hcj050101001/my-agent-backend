package com.example.backend.mask;

import com.example.backend.message.Message;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Mask {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String avatar;

    private String name;

    @OneToMany(mappedBy ="mask", cascade=CascadeType.ALL)
    private List<Message> context;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Message> getContext() {
        return context;
    }

    public void setContext(List<Message> context) {
        this.context = context;
    }
}
