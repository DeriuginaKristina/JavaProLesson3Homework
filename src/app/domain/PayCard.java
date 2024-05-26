package app.domain;

import java.math.BigDecimal;
import java.util.Objects;

public class PayCard {
    private String cardNumber;
    private String expiryDate;
    private String lastName;
    private String firstName;
    private String cvv;

    public PayCard(String cardNumber, String expiryDate, String lastName, String firstName, String cvv) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.lastName = lastName;
        this.firstName = firstName;
        this.cvv = cvv;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PayCard payCard = (PayCard) o;
        return Objects.equals(cardNumber, payCard.cardNumber) && Objects.equals(expiryDate, payCard.expiryDate) && Objects.equals(lastName, payCard.lastName) && Objects.equals(firstName, payCard.firstName) && Objects.equals(cvv, payCard.cvv);
    }

    @Override
    public String toString() {
        return String.format("Paycard: %s, lastname: %s, firstname: %s, expiryDate: %s,cvv: %s", cardNumber, lastName, firstName, expiryDate, cvv);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cardNumber, expiryDate, lastName, firstName, cvv);
    }
    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

}
