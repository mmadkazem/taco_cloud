package com.mmad.taco_cloud.Controllers;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
@RequestMapping("/api/test")
public class TestController {
    @GetMapping("{word}")
    public ResponseEntity<String> getExample(@PathVariable String word) {
        if (Objects.equals(word, "test"))
            return new ResponseEntity<>(word, HttpStatus.OK);

        return new ResponseEntity<>("Error", HttpStatus.BAD_REQUEST);
    }

}
