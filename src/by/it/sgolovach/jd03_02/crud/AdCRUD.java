package by.it.sgolovach.jd03_02.crud;

import by.it.sgolovach.jd03_02.ConnectionCreator;
import by.it.sgolovach.jd03_02.beans.Ad;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Locale;

public class AdCRUD {

    public static boolean create(Ad ad) throws SQLException {
        String sql = String.format(Locale.US, "INSERT INTO `ads`(`description`, `rooms`, `price`, `area`, `flat`, `flats`, `adress`, `users_id`)" +
                        " VALUES ('%s',%d,%f,%f,%d,%d,'%s',%d)", ad.getDescription(), ad.getRooms(), ad.getPrice(), ad.getArea(),
                ad.getFlat(), ad.getFlats(), ad.getAdress(), ad.getUsers_id());
        try (Connection connection = ConnectionCreator.getConnection();
             Statement statement = connection.createStatement()
        ) {
            boolean result = (1 == statement.executeUpdate(sql, Statement.RETURN_GENERATED_KEYS));
            if (result) {
                ResultSet generatedKeys = statement.getGeneratedKeys();
                if (generatedKeys.next()) {
                    int id = generatedKeys.getInt(1);
                    ad.setId(id);
                }
            }
            return result;
        }
    }

    public static boolean update(Ad ad) throws SQLException {
        String sql = String.format(Locale.US,"UPDATE " +
                        "`ads` SET `description`='%s',`rooms`=%d,`price`=%f,`area`=%f," +
                        "`flat`=%d,`flats`=%d,`adress`='%s',`users_id`=%d" +
                        " WHERE `id`=%d", ad.getDescription(), ad.getRooms(), ad.getPrice(), ad.getArea(), ad.getFlat(), ad.getFlats(),
                ad.getAdress(), ad.getUsers_id(), ad.getId());
        try (Connection connection = ConnectionCreator.getConnection();
             Statement statement = connection.createStatement()
        ) {
            return (1 == statement.executeUpdate(sql));
        }
    }

    public static boolean delete(Ad ad) throws SQLException {
        String sql=String.format(Locale.US,"DELETE FROM `ads` WHERE `id`=%d",ad.getId());
        try (Connection connection = ConnectionCreator.getConnection();
             Statement statement = connection.createStatement()
        ) {
            return (1 == statement.executeUpdate(sql));
        }
    }


    public static Ad read(int id) throws SQLException {
        String sql=String.format(Locale.US,"SELECT * FROM `ads` WHERE `id`=%d",id);
        try (Connection connection = ConnectionCreator.getConnection();
             Statement statement = connection.createStatement()
        ) {
            ResultSet resultSet=statement.executeQuery(sql);
            if(resultSet.next()) {
                return new Ad(
                        resultSet.getInt("id"),
                        resultSet.getString("description"),
                        resultSet.getInt("rooms"),
                        resultSet.getDouble("price"),
                        resultSet.getDouble("area"),
                        resultSet.getInt("flat"),
                        resultSet.getInt("flats"),
                        resultSet.getString("adress"),
                        resultSet.getInt("users_id")
                );
            }

        }
        return null;
    }
}
