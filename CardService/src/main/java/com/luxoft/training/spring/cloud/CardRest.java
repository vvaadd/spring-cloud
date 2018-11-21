package com.luxoft.training.spring.cloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardRest {
    private final CardNumberGenerator generator;

    @Autowired
    public CardRest(CardNumberGenerator generator) {
        this.generator = generator;
    }

    @RequestMapping("create")
    public String createNewCard() {
        return generator.generate();
    }
}
