package com.nishi.CGPT.rest;

import com.nishi.CGPT.service.GptService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/gpt")
public class GptController {

    @Autowired
    private GptService gptService;

    @GetMapping("/generateImage")
    public String getResponse(@RequestParam("prompt") String prompt){

        return gptService.getResponse(prompt);
    }

}
