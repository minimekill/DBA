package dba;

import java.sql.DriverManager;

public class Connection {
    
    private java.sql.Connection conn = null;

    //Constants
    private static final String IP = "localhost";
    private static final int PORT = 3306;
    public static final String DATABASE = "local";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "dixie";

    public Connection() throws Exception {
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        String url = "jdbc:mysql://" + IP + ":" + PORT + "/" + DATABASE;
        this.conn = (java.sql.Connection) DriverManager.getConnection(url, USERNAME, PASSWORD);
    }

    public java.sql.Connection getConnection() {
        return this.conn;
    }
}