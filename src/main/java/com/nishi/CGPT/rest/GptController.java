package com.nishi.CGPT.rest;

import com.nishi.CGPT.dto.GptResponse;
import com.nishi.CGPT.dto.UserRequest;
import com.nishi.CGPT.service.GptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@RestController
@RequestMapping("/gpt")
public class GptController {

    @Autowired
    private GptService gptService;

    @GetMapping("/chat")
    public String getResponse(@RequestParam("prompt") String prompt){

        return gptService.getResponse(prompt);
    }

}
