public class Main {
    public static void main(String[] args) {
        Money money = new Money(135000);
        try {
            System.out.println(money.pay(124000));
        } catch (NoMoneyException| ArithmeticException e) {
            System.out.println("Unable to pay");
        }
        System.out.println("It is will be ok!");
    }
}