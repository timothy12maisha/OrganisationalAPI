package dao;
import org.sql2o.*;
import java.net.URI;
import java.net.URISyntaxException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DatabaseInterface {
    private static URI databaseInterfaceUri;
    public static Sql2o sql2o;
    static Logger userloggin = LoggerFactory.getLogger(DatabaseInterface.class);
    static {

        try {
            if (System.getenv("DATABASE_URL") == null) {
                databaseInterfaceUri = new URI("postgres://localhost:5432/news_site");
            } else {
                databaseInterfaceUri = new URI(System.getenv("DATABASE_URL"));
            }
            int port = databaseInterfaceUri.getPort();
            String host = databaseInterfaceUri.getHost();
            String path = databaseInterfaceUri.getPath();
            String username = (databaseInterfaceUri.getUserInfo() == null) ? "timothymaina" : databaseInterfaceUri.getUserInfo().split(":")[0];
            String password = (databaseInterfaceUri.getUserInfo() == null) ? "1234" : databaseInterfaceUri.getUserInfo().split(":")[1];
            sql2o = new Sql2o("jdbc:postgresql://" + host + ":" + port + path, username, password);
        } catch (URISyntaxException e ) {
            userloggin.error("Unable to connect to database.");
        }
    }
}
