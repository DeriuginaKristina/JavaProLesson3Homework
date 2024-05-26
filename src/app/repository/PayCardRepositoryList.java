package app.repository;

import app.domain.PayCard;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository

public class PayCardRepositoryList implements PayCardRepository {
    List<PayCard> database = new ArrayList<>();

    public PayCardRepositoryList() {
        database.add(new PayCard("1234 5645 4567 1234", "12/24", "Ivanov", "Igor", "123"));
        database.add(new PayCard("1244 5423 6541 2345", "12/25", "Gavrilov", "Alexandr", "235"));
        database.add(new PayCard("1244 5523 6641 2385", "12/25", "Kuznecov", "Andrey", "456"));
    }
    @Override
    public boolean isPayCardValid(PayCard payCard) {
        for (PayCard payCardInTheList : database) {
            if (payCardInTheList.equals(payCard)){
                System.out.println("Paycard is found");
                return true;
            }
        }
        System.out.println("Paycard is not found");
        return false;
    }
}
