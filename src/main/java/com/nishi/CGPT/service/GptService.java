package com.nishi.CGPT.service;

import com.nishi.CGPT.dto.GptResponse;
import com.nishi.CGPT.dto.UserRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class GptService {

    @Autowired
    private RestTemplate template;

    @Value("${cgpt.api.url}")
    private String gptUrl;

    public String getResponse(String prompt){
        UserRequest request = new UserRequest("gpt-3.5-turbo",prompt);
        GptResponse response = template.postForObject(gptUrl,request,GptResponse.class);
        return response.getChoices().get(0).getMessage().getContent();
    }
}
