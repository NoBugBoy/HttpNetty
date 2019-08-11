package server.database;


import server.Constance;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
public class ConnUtils {
    private static Connection connection = null;
    private static  String url = null;
    private static  String name = null;
    private static  String password = null;
    private static  String driver = null;
    public ConnUtils(){
        Properties properties = new Properties();
        try {

            properties.load(new FileInputStream("src/main/resources/db.properties"));
            url = properties.getProperty(Constance.DB_URL);
            name = properties.getProperty(Constance.DB_NAME);
            password = properties.getProperty(Constance.DB_PASSWORD);
            driver = properties.getProperty(Constance.DB_DRIVER);
            Class.forName(driver);
            connection = DriverManager.getConnection(url, name, password);
            System.out.println("======DB成功建立连接=====");
        } catch (IOException e) {
            System.err.println("======DB连接失败=====");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.err.println("======找不到驱动类=====");
            e.printStackTrace();
        } catch (SQLException e) {
            System.err.println("======SQL异常=====");
            e.printStackTrace();
        }
    }

    public static synchronized Connection getConn(){
        try {
            connection.setAutoCommit(true);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
    public static void close(){
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
