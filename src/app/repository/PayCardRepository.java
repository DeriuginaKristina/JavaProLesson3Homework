package app.repository;

import app.domain.PayCard;

public interface PayCardRepository {
    boolean isPayCardValid(PayCard payCard);
}

