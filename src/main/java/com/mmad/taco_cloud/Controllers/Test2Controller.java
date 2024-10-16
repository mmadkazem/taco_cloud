package com.mmad.taco_cloud.Controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test2")
public class Test2Controller {
    @GetMapping("{word}")
    public ResponseEntity<String> getTest(@PathVariable String word) {
        if (!word.equals("test")) {
            return  ResponseEntity.notFound().build();
        }
        return  ResponseEntity.ok("test is find");
    }
}
