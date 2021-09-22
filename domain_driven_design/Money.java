import java.util.Objects;

public class Money {
    /**
     * Money in dollars
     */
    private int dollars;
    
    /**
     * Money in cents
     */
    private int cents;

    /**
     * Money object
     * @param dollars dollar value
     * @param cents cents value
     */
    public Money(int dollars, int cents) {
        this.dollars = dollars;
        this.cents = cents;
    }

    /**
     * Gets dollars value
     * @return
     */
    public int getDollars() {
        return dollars;
    }

    /**
     * Gets cents value
     * @return
     */
    public int getCents() {
        return cents;
    }

    /**
     * Adds money to the current object
     * @param money money object
     * @return current object with added values
     */
    public Money addMoney(Money money) {
        int centsInADollar = 100;
        int sumCents = money.cents + this.cents;

        this.dollars += money.dollars;

        if ((sumCents) >= centsInADollar) {
            this.dollars += 1;
            this.cents = sumCents - centsInADollar;
        
        } else {
            this.cents += sumCents;
        }

        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(dollars, cents);
    }

    @Override
    public boolean equals(Object o) {
        if(o instanceof Money) {
            Money other = (Money)o;
            return this.dollars == other.dollars && this.cents == other.cents;
        } else {
            return false;
        }
    }
    

    @Override
    public String toString() {
        return String.format("Money{%s, %s}", this.dollars, this.cents);
    }

    public static void main(String[] args) {

        Money money = new Money(5, 23);
        System.out.println(money);

        Money anotherMoney = new Money(5, 23);
        System.out.println(money.equals(anotherMoney));

        money.addMoney(new Money(10, 80));
        
        System.out.println(money);
        System.out.println(money.equals(anotherMoney));


    }
}
