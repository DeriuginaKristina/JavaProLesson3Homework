package app.service;

import app.domain.PayCard;
import app.repository.PayCardRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

@Service
@PropertySource("classpath:application.properties")
public class PayCardServiceImpl implements PayCardService {
    private final PayCardRepository repository;
    private final String payCardCountryPrefix;
    // Three ways with help Spring
    //1 Annotation @Autowired on field Class
    //2 Input through Constructor
    //3 Input Setter


    public PayCardServiceImpl(PayCardRepository repository,
                              @Value("${payCardCountry.prefix}") String payCardCountryPrefix) {
        this.repository = repository;
        this.payCardCountryPrefix = payCardCountryPrefix;
    }

    @Override
    public boolean isPayCardValid(PayCard payCard) {
        boolean isValid = repository.isPayCardValid(payCard);
        if (!isValid) {
            logIsNotValid(payCard);
            return false;
        }
        return true;
    }

    private void logIsNotValid(PayCard payCard) {
        System.out.printf("Paycard from %s is not valid%n", payCardCountryPrefix);
    }

}
