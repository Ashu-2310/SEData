package com.SB.SEData.controller;

import com.SB.SEData.model.SoftwareEngineer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/software-engn")
public class SoftwareEngineerController {

    @GetMapping("/fetch")
    public List<SoftwareEngineer> getEngineers(){
        return List.of()
    }
}
