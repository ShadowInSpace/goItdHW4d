package sqlUtils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    public Connection getConnection() {
        return connection;
    }

    private final Connection connection;
    //H2:
    private final String url = "jdbc:h2:~/test";
    private final String user = "ShadowInSpace";
    private final String password = "edcyhn";

    //постгрес:
//    private final String url = "jdbdc:postgresql://localhost:5432/test";
//    private final String user = "postgres";
//    private final String password = "159753";


    public Database() {
        try {

            connection = DriverManager.getConnection(url,user,password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
