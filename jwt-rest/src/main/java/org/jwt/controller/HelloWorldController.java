package org.jwt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;


@RestController
public class HelloWorldController {

    @GetMapping("/getAll")
    public String getAll(@PathParam("phone") String phone) {
        return "Get all";
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello world";
    }
}
