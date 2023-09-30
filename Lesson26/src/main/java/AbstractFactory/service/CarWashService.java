package AbstractFactory.service;

public class CarWashService implements WashService{

    @Override
    public void doWash() {
        System.out.println("Your car has been washed");
    }

}
