public class Service {

    public static boolean findEmployee (Director director, String name) {
        for (Employee employee : director.getSubordArray()) {
            if (employee != null) {
                if (employee.getName().equals(name)) {
                    return true;
                } else if (employee.getPosition().equals(Employ.DIRECTOR)) {
                    return findEmployee((Director) employee, name);
                }
            } else {
                continue;
            }
        }
        return false;
    }


    public static void infEmployee (Director director) {
        System.out.println(director.toString());
        for (Employee employee : director.getSubordArray()) {
            if (employee != null) {
                if (employee.getPosition().equals(Employ.WORKER)) {
                    System.out.println(employee.toString());
                } else if (employee.getPosition().equals(Employ.DIRECTOR)) {
                    infEmployee((Director) employee);
                }
            } else {
                break;
            }
        }
    }
}
