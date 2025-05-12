package com.priyanshee.ExceptionHandling.question9;

import java.sql.SQLException;

public class Service {
    private Repository repository = new Repository();

    public void processData() throws ServiceLayerException {
        try {
            repository.fetchDataFromDB();
        } catch (SQLException e) {
            throw new ServiceLayerException("Service failed while fetching data", e);
        }
    }
}
