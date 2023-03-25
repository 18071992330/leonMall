package org.leon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class StandardRestTemplate {
    @Autowired
    public RestTemplate restTemplate;

    public <T> T sendByPost(String url, Object param, Class<T> resultType) {
        return restTemplate.postForObject(url, param, resultType);
    }

}
