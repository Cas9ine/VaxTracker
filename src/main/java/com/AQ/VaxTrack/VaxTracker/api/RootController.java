package com.AQ.VaxTrack.VaxTracker.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class RootController {
    @GetMapping("/")
    public String home() {
        return "Hola ese";
    }
}
