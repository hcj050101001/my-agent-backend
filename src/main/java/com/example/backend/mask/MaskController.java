package com.example.backend.mask;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mask")
public class MaskController {

    @Autowired
    private MaskRepository maskRepository;

    @GetMapping("all")
    public Iterable<Mask> findAll() {
        return maskRepository.findAll();
    }
}
