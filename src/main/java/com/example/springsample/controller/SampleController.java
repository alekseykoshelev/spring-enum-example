package com.example.springsample.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/meme")
public class SampleController {

    @PostMapping("/add")
    public ResponseEntity<Void> getEnum(@RequestBody EntitySample entity) {
        System.out.println(entity.getName());
        System.out.println(entity.getSize());
        return ResponseEntity.ok().build();
    }
}
