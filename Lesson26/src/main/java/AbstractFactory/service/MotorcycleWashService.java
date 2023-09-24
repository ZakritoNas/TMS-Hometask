package AbstractFactory.service;


public class MotorcycleWashService implements WashService {

    @Override
    public void doWash() {
        System.out.println("Your motorcycle has been completely washed");
    }

}
