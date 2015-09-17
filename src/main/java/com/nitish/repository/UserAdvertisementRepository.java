package com.nitish.repository;

import com.nitish.domain.Advertisement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by nsm1211 on 17-09-2015.
 */
@Repository
public class UserAdvertisementRepository {

    @Autowired
    private DataSource dataSource;

//    private static final String USER_INSERT_QUERY = "insert into USER_ACCOUNT (userId, name, emailId) values (?,?,?)";
    private static final String ADVERTISEMENT_SELECT_QUERY = "select * from ADVERTISEMENT where emailId = ?";

/*
    public UserDomain addUserAdvertisement(UserDomain userModel) throws SQLException {
        Connection connection = preparationBeforeSqlUpdate();
        PreparedStatement preparedStatement = connection.prepareStatement(USER_INSERT_QUERY);
        preparedStatement.setInt(1, userModel.getUserId());
        preparedStatement.setString(2, userModel.getName());
        preparedStatement.setString(3, userModel.getEmailId());
        int rowEffected = preparedStatement.executeUpdate();
        System.out.println(" no of row inserted into DB = "+rowEffected);
        preparationAfterSqlUpdate(connection);
        return userModel;
    }
*/

    public Advertisement getAdvertisementByEmailId(String userId) {
        Connection connection = null;
        Advertisement advertisement = new Advertisement();
        try {
            connection = preparationBeforeSqlUpdate();
            PreparedStatement preparedStatement = connection.prepareStatement(ADVERTISEMENT_SELECT_QUERY);
            preparedStatement.setString(1, userId);
            ResultSet resultSet = preparedStatement.executeQuery();
            List<String> productList = new ArrayList<>();
            while (null != resultSet && resultSet.next()) {
                if (advertisement.getID() == 0) {
                    advertisement.setID(resultSet.getInt(1));
                }
                if (null == advertisement.getEmailId()) {
                    advertisement.setEmailId(resultSet.getString(2));
                }
                advertisement.getProducts().add(resultSet.getString(3));
            }
            preparationAfterSqlUpdate(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return advertisement;
    }

    private void preparationAfterSqlUpdate(Connection connection) throws SQLException {
        connection.commit();
    }

    private Connection preparationBeforeSqlUpdate() throws SQLException {
        Connection connection = dataSource.getConnection();
        connection.setAutoCommit(false);
        return connection;
    }

}
