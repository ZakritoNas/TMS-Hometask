package Service;

import Config.DataBaseConfig;
import Domain.City;
import Domain.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentService {


    public List<Student> findlAll() throws SQLException {
        List<Student> studentsList = new ArrayList<>();
        Connection connection = DataBaseConfig.getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select students.name, students.sex, cities.name from students left join cities on students.city = cities.city_id");

        while (resultSet.next()) {
            String name = resultSet.getString(1);
            String sex = resultSet.getString(2);
            String city = resultSet.getString(3);
            Student student = new Student(name, sex, city);

            studentsList.add(student);
        }
        connection.close();
        return studentsList;
    }

    public void save(Student student) throws SQLException {
        Connection connection = DataBaseConfig.getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select max (student_id) + 1 from students");
        resultSet.next();
        int nextId = resultSet.getInt(1);

        var preparedStatement = connection
                .prepareStatement("insert into students (student_id, name, sex, city) values (?, ?, ?, ?)");

        preparedStatement.setInt(1, nextId);
        preparedStatement.setString(2, student.getName());
        preparedStatement.setString(3, student.getSex());


        new CityService().save(new City(student.getCity()));
        preparedStatement.setInt(4, CityService.getByName(student.getCity()));
        preparedStatement.execute();
        connection.close();
    }

    public void deleteStudent (int studentId) {
        try{Connection connection = DataBaseConfig.getConnection();
            PreparedStatement prepared = connection.prepareStatement("delete from students where student_id = ?");
            prepared.setInt(1, studentId);
            prepared.executeUpdate();
        } catch (SQLException s){
            throw new RuntimeException(s);
        }
    }


}
