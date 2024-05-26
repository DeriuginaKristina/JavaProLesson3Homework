package client;

import app.controller.PayCardController;
import app.domain.PayCard;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Client {

    public static void main(String[] args) {

        AbstractApplicationContext context = new AnnotationConfigApplicationContext("app");
        PayCardController controller = context.getBean(PayCardController.class);
        PayCard payCardValid = new PayCard("1244 5523 6641 2385", "12/25", "Kuznecov", "Andrey", "456");
        PayCard payCardNoValid = new PayCard("1244 5523 6641 2315", "12/25", "Kuznecov", "Andrey", "456");
        //Check valid card
        boolean isPayCardValid = controller.isPayCardValid(payCardValid);
        System.out.println(payCardValid + " Is: " + isPayCardValid);
        //Check invalid card
        isPayCardValid = controller.isPayCardValid(payCardNoValid);
        System.out.println(payCardNoValid + " Is: " + isPayCardValid);
    }
}
