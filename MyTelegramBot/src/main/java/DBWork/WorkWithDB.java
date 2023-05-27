package DBWork;

import java.sql.Connection;
import java.sql.Driver;

public class WorkWithDB {
    Class<Driver> driverClass = Driver.class;
    private static WorkWithDB workWithDBDB;
    Connection connection;

    private WorkWithDB() {
        this.connection = DbConnect.open();
    }

    public static WorkWithDB Start(){//запуск работы с базами данных

    if (workWithDBDB==null){
        workWithDBDB= new WorkWithDB();
        return workWithDBDB;

    }else {
        throw new RuntimeException();
    }
    }

}
