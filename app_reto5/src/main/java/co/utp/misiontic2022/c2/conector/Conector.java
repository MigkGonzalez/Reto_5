package co.utp.misiontic2022.c2.conector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conector {
    private static final String DATABASE_LOCATION = "//localhost:3306/proyectos";

    public static Connection getConnection() throws SQLException {
        String url = "jdbc:mysql:"+DATABASE_LOCATION;

        return DriverManager.getConnection(url, "root", "");

    }
}
