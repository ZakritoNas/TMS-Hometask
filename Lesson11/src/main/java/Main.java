public class Main {
    public static void main(String[] args) {
        PersonalArrayList<String> stringArrayList = new PersonalArrayList<>(5);
        stringArrayList.add("monkey");
        stringArrayList.add("pig");
        stringArrayList.add("hamster");
        stringArrayList.add("parrot");

        System.out.println(stringArrayList.getSize());
        System.out.println(stringArrayList);

        System.out.println(stringArrayList.foundIndex(1));

        stringArrayList.remove(1);
        System.out.println(stringArrayList);

        System.out.println(stringArrayList.foundElement("hamster"));
        System.out.println(stringArrayList.foundElement("сat"));


        stringArrayList.clear();
    }
}

