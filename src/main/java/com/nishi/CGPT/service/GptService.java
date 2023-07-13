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
        UserRequest request = new UserRequest(prompt,2,"1024x1024");
        GptResponse response = template.postForObject(gptUrl,request,GptResponse.class);
        System.out.println(response.toString());
        if(response == null || response.toString().equals("")){
            return "No response";
        }
        else return response.getData().get(0).getUrl();

    }
}
