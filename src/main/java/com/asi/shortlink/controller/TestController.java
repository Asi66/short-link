package com.asi.shortlink.controller;

import com.asi.shortlink.controller.request.AddShortLinkRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

    @RequestMapping("test")
    public ResponseEntity<String> add() {
        return ResponseEntity.ok("success");
    }
}
