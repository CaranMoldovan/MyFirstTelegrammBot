package DBWork;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/*
утилитарный класс для загрузки информации о подключении к базе данных
 */
 class ConnectionUtil {
    private static ConnectionUtil instance = null;
    private Properties properties;

    private ConnectionUtil() {
        properties = new Properties();
        try {
            InputStream inputStream = getClass().getClassLoader().getResourceAsStream("DBresources/database.properties");
            properties.load(inputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static ConnectionUtil getInstance() {
        if (instance == null) {
            instance = new ConnectionUtil();
        }
        return instance;
    }

    public String getProperty(String key) {
        return properties.getProperty(key);
    }
}

