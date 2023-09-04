package Service;

import Config.DataBaseConfig;
import Domain.City;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CityService {


    public void save (City city) throws SQLException {
        if (citiesExist(city.getName())){
            return;
        }
        Connection connection = DataBaseConfig.getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSetForId = statement.executeQuery("select max (city_id) + 1 from cities");
        boolean next = resultSetForId.next();
        int nextId = resultSetForId.getInt(1);

        var preparedStatement = connection
                .prepareStatement("insert into cities (city_id, name) values (?, ?)");

        preparedStatement.setInt(1, nextId);
        preparedStatement.setString(2, city.getName());
        preparedStatement.execute();
        connection.close();
    }

    public static int getByName (String name) throws SQLException {
        try {Connection connection = DataBaseConfig.getConnection();
            PreparedStatement prepared = connection.prepareStatement("select city_id from cities where name = ?");
            prepared.setString(1, name);
            ResultSet resultSet = prepared.executeQuery();
            resultSet.next();
            return resultSet.getInt(1);
        } catch (SQLException s){
            throw new SQLException(s);
        }
    }

    public static boolean citiesExist (String name) {
        try{ Connection connection = DataBaseConfig.getConnection();
            PreparedStatement prepared = connection.prepareStatement("select city_id from cities where name = ?");
            prepared.setString(1, name);            ResultSet resultSet = prepared.executeQuery();
            return resultSet.next();
        } catch (SQLException s){
            return false;
        }
    }

    public void deleteCity (int cityId) {
        try{Connection connection = DataBaseConfig.getConnection();
            PreparedStatement prepared = connection.prepareStatement("update students set city = null where city = ?");
            prepared.setInt(1, cityId);
            prepared.executeUpdate();

            PreparedStatement prepar = connection.prepareStatement("delete from cities where city_id = ?");
            prepar.setInt(1, cityId);
            prepar.executeUpdate();

        } catch (SQLException s) {
            throw new RuntimeException(s);
        }
    }

    public List<City> findlAll() throws SQLException {
        List<City> citiesList = new ArrayList<>();
        Connection connection = DataBaseConfig.getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select name from cities");

        while (resultSet.next()) {
            String name = resultSet.getString(1);
            City city = new City(name);
            citiesList.add(city);
        }
        connection.close();
        return citiesList;
    }


}
