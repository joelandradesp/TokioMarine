package br.com.tokiomarine.seguradora.avaliacao.app.connection;


import br.com.tokiomarine.seguradora.avaliacao.app.utility.Util;

public class ConnectionPropertiesManager {

    private String host;
	private int port;
	private String database;
	private String login;
	private String password;
	private String driver;
	private String driverClassName;
	private String driverManager;

	public ConnectionPropertiesManager() {
		Util util = new Util();

        host = util.loadProperty("DATABASE_HOST");
		port = Integer.parseInt(util.loadProperty("DATABASE_PORT"));
		database = util.loadProperty("DATABASE_NAME");
		login = util.loadProperty("username");
		password = util.loadProperty("password");
		driver = "jdbc";
		driverClassName = "com.mysql.cj.jdbc.Driver";
		driverManager = "mysql";
	}

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getDriverClassName() {
        return driverClassName;
    }

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }

    public String getDriverManager() {
        return driverManager;
    }

    public void setDriverManager(String driverManager) {
        this.driverManager = driverManager;
    }
}