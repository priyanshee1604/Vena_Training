package com.priyanshee.ExceptionHandling.question9;

import java.sql.SQLException;

public class Repository {
    public void fetchDataFromDB() throws SQLException {
        throw new SQLException("Database connection failed.");
    }
}
