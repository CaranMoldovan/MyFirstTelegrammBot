package DBWork;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//подключение базы данных с использованием файла данных базы
 class DbConnect {
private static final String NAME ="db.home.name";
private static final String PASSWORD ="db.home.password";
private static final String URL ="db.home.url";

    private DbConnect() {
    }
    public static Connection open(){
        ConnectionUtil conn = ConnectionUtil.getInstance();
        try {
            return DriverManager.getConnection(conn.getProperty(URL),conn.getProperty(NAME),conn.getProperty(PASSWORD));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
