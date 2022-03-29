package pms.pmsapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Connection;
import java.sql.DriverManager;

@SpringBootApplication
public class PmsApiApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(PmsApiApplication.class, args);

        databaseConnection();
    }

    private static final String driver = "com.mysql.cj.jdbc.Driver";
    private static final String url = "jdbc:mysql://101.101.216.193:3306/pms";
    private static final String user = "metis";
    private static final String password = "metisInfo2010@#@";

    public static void databaseConnection() throws Exception {
        Class.forName(driver);

        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connection Result : " + connection);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
