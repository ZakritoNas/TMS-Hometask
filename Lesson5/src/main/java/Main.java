public class Main {
    public static void main(String[] args) {
        CreditCard CreditCard1 = new CreditCard("BY254AKKB635248100000", 18530);
        CreditCard CreditCard2 = new CreditCard("BY1205SLAN69500020416", 5000);
        CreditCard CreditCard3 = new CreditCard("BY3012SLAN35289600000", 158720);

        CreditCard1.currentUp(560);
        CreditCard2.currentUp(340);
        CreditCard3.currentDown(720);

        CreditCard1.currentInf();
        CreditCard2.currentInf();
        CreditCard3.currentInf();
    }
}
