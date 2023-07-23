public class Main {
    public static void main(String[] args) {

        Phone phone1 = new Phone(295738391, 400, "Samsung");
        Phone phone2 = new Phone(336524879, 300, "Xiaomi");
        Phone phone3 = new Phone(445968712, 300, "Huawei");

        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone3);

        phone1.receiveCall("Вася");
        phone2.receiveCall("Петя");
        phone3.receiveCall("Юля");

        phone1.getNumber();
        phone2.getNumber();
        phone3.getNumber();

        phone3.receiveCall("Юля", 3365214);

        phone1.sendMessage(336524152, 445968686, 296354865);
    }
}
