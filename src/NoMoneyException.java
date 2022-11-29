public class NoMoneyException extends Exception{

    public NoMoneyException(long got, long needed) {
        System.out.println("Not enough money, got " + got + ", expected " + needed);
    }
}
