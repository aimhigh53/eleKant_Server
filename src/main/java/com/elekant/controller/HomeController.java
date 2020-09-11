package com.elekant.controller;

import com.elekant.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @Autowired
    private MemberRepository repo;

    @GetMapping("/test")
    public String home(){
        return "test";
    }
}

