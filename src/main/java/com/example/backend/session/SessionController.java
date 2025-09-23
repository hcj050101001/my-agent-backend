package com.example.backend.session;

import com.example.backend.message.Message;
import com.example.backend.message.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

@Repository
@RequestMapping("/session")
public class SessionController {

    @Autowired
    SessionRepository sessionRepository;

    @Autowired
    MessageRepository messageRepository;

    @PostMapping("/add")
    public String addSession(@RequestBody Session session){
        sessionRepository.save(session);
        return "saved";
    }

    @PostMapping("/message/add")
    public String addMessage(@RequestParam String sessionId, @RequestBody Message message){
        Session session=sessionRepository.findById(sessionId).get();
        message.setSession(session);
        messageRepository.save(message);
        return "saved";
    }

    @PostMapping("/delete")
    public String deleteSession(@RequestParam String sessionId){
        sessionRepository.deleteById(sessionId);
        return "deleted";
    }

    @GetMapping("/all")
    public Iterable<Session> getAllSessions(){
        return sessionRepository.findAll();
    }
}
