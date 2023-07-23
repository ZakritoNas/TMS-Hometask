public class Phone {
    private int number;
    private int weight;
    private String model;

    public Phone(int number, int weight, String model) {
        this(number, model);
        this.weight = weight;
    }

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {};

    public String toString (){
        return "Номер: " + number + "," + " Вес: " + weight + "," + " Модель: " + model;
    }

    public int getNumber() {
        return number;
    }

    public void receiveCall (String name){
        System.out.println("Звонит " + name);
    }

    public void receiveCall (String name, int number){
        System.out.println("Вам звонит " + name + ", " + number);
    }

    public void sendMessage (int ... numbers) {
        for (int number : numbers) {
            System.out.println(number);
        }
    }

}
