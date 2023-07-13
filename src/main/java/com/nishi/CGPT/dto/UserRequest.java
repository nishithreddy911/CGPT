package com.nishi.CGPT.dto;

import lombok.Data;

@Data
public class UserRequest {

    private String prompt;
    private int n;
    private String size;

    public UserRequest(String prompt, int n, String size) {
        this.prompt = prompt;
        this.n = n;
        this.size = size;
    }
    //    public UserRequest(String model, String prompt) {
//        this.model = model;
//        this.messages = new ArrayList<>();
//        this.messages.add(new Message("user",prompt));
//    }
}
