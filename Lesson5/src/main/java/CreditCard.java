public class CreditCard {

    private String accountNumb;
    private double currentNumb;
    public CreditCard (String accountNumb, double currentNumb) {
        this.accountNumb = accountNumb;
        this.currentNumb = currentNumb;
    }
    public double currentUp (double p) {
        currentNumb = currentNumb + p;
        return currentNumb;
    }
    public double currentDown (double m) {
        currentNumb = currentNumb - m;
        return currentNumb;
    }
    public void currentInf () {
        System.out.println("Номер счета " + accountNumb);
        System.out.println("Текущая сумма на счете: " + currentNumb + " р.");
    }
}
