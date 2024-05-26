package app.service;

import app.domain.PayCard;

public interface PayCardService {
    boolean isPayCardValid(PayCard payCard);
}
