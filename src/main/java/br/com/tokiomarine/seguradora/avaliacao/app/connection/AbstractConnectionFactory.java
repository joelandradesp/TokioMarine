package br.com.tokiomarine.seguradora.avaliacao.app.connection;

import java.io.StringWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class AbstractConnectionFactory {

    private static final String utcTimeZone = "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private static final ConnectionPropertiesManager connectionPropertiesManager = new ConnectionPropertiesManager();

    public static Connection getConnection() throws SQLException {
        StringWriter databaseURL = new StringWriter();

        databaseURL
                .append(connectionPropertiesManager.getDriver())
                .append(":")
                .append(connectionPropertiesManager.getDriverManager())
                .append("://")
                .append(connectionPropertiesManager.getHost())
                .append(":")
                .append(String.valueOf(connectionPropertiesManager.getPort()))
                .append("/")
                .append(connectionPropertiesManager.getDatabase())
                .append(utcTimeZone)
                .append("&noAccessToProcedureBodies=true");

        return DriverManager.getConnection(databaseURL.toString(), connectionPropertiesManager.getLogin(), connectionPropertiesManager.getPassword());
    }

}