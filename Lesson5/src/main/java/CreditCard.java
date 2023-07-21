public class CreditCard {

    private String accountNumb;
    private long currentNumb;
    public CreditCard (String accountNumb, long currentNumb) {
        this.accountNumb = accountNumb;
        this.currentNumb = currentNumb;
    }
    public double currentUp (long plus) {
        currentNumb = currentNumb + plus;
        return currentNumb;
    }
    public double currentDown (long minus) {
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
