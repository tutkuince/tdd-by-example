package com.muditasoft._01money;

import java.util.Objects;

public class Franc {
    private int amount;

    public Franc(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Franc times(int multiplier) {
        return new Franc(amount * multiplier);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Franc)) return false;
        Franc franc = (Franc) o;
        return getAmount() == franc.getAmount();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAmount());
    }
}
