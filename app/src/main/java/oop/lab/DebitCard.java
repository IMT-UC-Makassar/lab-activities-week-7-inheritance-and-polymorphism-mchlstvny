package oop.lab;

public class DebitCard extends Card {
    public DebitCard (String cardNumber, String cardHolder) {
        super(cardNumber, cardHolder);
    }

    public double getInterestRate() {
        return 0.0;
    }
}