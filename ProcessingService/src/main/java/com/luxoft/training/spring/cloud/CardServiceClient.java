package com.luxoft.training.spring.cloud;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("CardService")
public interface CardServiceClient {
    @RequestMapping("create")
    String createCard();
}
