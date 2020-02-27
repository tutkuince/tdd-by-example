package com.muditasoft._01money;

public class Dollar extends Money {

    private String currency;

    public Dollar(int amount) {
        this.amount = amount;
        this.currency = "USD";
    }

    public Money times(int multiplier) {
        return new Dollar(amount * multiplier);
    }

    @Override
    protected String currency() {
        return currency;
    }
}
