package com.example.backend.session;

import com.example.backend.mask.Mask;
import com.example.backend.message.Message;
import jakarta.persistence.*;
import java.util.List;

@Entity
public class Session {

    @Id
    private String id;

    private String createTime;

    private String lastUpdate;

    private String topic;

    @OneToOne
    @JoinColumn(name="mask_id",referencedColumnName = "id")
    private Mask mask;

    @OneToMany(mappedBy = "session",cascade = CascadeType.ALL)
    private List<Message> messages;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    public Mask getMask() {
        return mask;
    }

    public void setMask(Mask mask) {
        this.mask = mask;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(String lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
}
