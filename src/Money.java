public class Money {

    long amount;

    public Money(long amount) {
        this.amount = amount;
    }

    public long pay(long amount) throws NoMoneyException {
        if (this.amount >= amount)
            this.amount -= amount;
        else
            throw new NoMoneyException(this.amount, amount);
        return this.amount;
    }

}

