import Domain.City;
import Domain.Student;
import Service.CityService;
import Service.StudentService;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException {

        StudentService service = new StudentService();
        CityService cityService = new CityService();

        service.save(new Student("Nikolay", "men", "Minsk"));
        service.save(new Student("Jana", "women", "Vitebsk"));
        service.save(new Student("Nastya", "women", "Madrid"));

        System.out.println(service.findlAll());
        service.deleteStudent(2);

        cityService.save(new City("Marsel"));

        System.out.println(cityService.findlAll());
        cityService.deleteCity(9);
    }

}
