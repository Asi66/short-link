package com.asi.shortlink.controller;

import com.asi.shortlink.controller.request.AddShortLinkRequest;
import com.asi.shortlink.service.ShortLinkInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("short/link")
@Controller
public class ShortController {

    @Autowired
    private ShortLinkInfoService shortLinkInfoService;

    @PostMapping("add")
    public ResponseEntity<String> add(@RequestBody AddShortLinkRequest addShortLinkRequest) {
        shortLinkInfoService.add(addShortLinkRequest);

        return ResponseEntity.ok("success");
    }

}
