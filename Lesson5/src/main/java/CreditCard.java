public class CreditCard {

    private String accountNumb;
    private double currentNumb;
    public CreditCard (String accountNumb, double currentNumb) {
        this.accountNumb = accountNumb;
        this.currentNumb = currentNumb;
    }
    public double currentUp (double plus) {
        currentNumb = currentNumb + plus;
        return currentNumb;
    }
    public double currentDown (double minus) {
        if (currentNumb > 0 && minus > 0) {
            currentNumb = currentNumb - minus;
        }
        return currentNumb;
    }
    public void currentInf () {
        System.out.println("Номер счета " + accountNumb);
        System.out.println("Текущая сумма на счете: " + currentNumb + " р.");
    }
}
