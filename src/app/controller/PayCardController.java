package app.controller;

import app.domain.PayCard;
import app.service.PayCardService;
import org.springframework.stereotype.Component;

@Component
public class PayCardController {

    private PayCardService service;

    public PayCardController(PayCardService service) {
        this.service = service;
    }

    public boolean isPayCardValid(PayCard payCard) {
        return service.isPayCardValid(payCard);
    }
}
