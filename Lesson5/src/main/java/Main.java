public class Main {
    public static void main(String[] args) {
        CreditCard CreditCard1 = new CreditCard("BY254AKKB635248100000", 185.30);
        CreditCard CreditCard2 = new CreditCard("BY1205SLAN69500020416", 50.00);
        CreditCard CreditCard3 = new CreditCard("BY3012SLAN35289600000", 1587.20);

        CreditCard1.currentUp(5.60);
        CreditCard2.currentUp(3.40);
        CreditCard3.currentDown(7.20);

        CreditCard1.currentInf();
        CreditCard2.currentInf();
        CreditCard3.currentInf();
    }
}
