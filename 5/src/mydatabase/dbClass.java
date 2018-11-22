package mydatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by Fatemeh on 12/4/2016.
 */
public class dbClass {
    public static PreparedStatement getPreparedStatement(String sql) throws ClassNotFoundException , SQLException {
        PreparedStatement ps = null;
        Class .forName("org.postgresql.Driver");
        String url = "jdbc:postgresql://localhost:5432/DBSec1";
        String user = "postgres";
        String pass = "fa6121373";
        Connection con = DriverManager.getConnection(url, user , pass);
        ps = con.prepareStatement(sql);
        System.out.println("in postgresql");
        return ps;
    }
    public static void main(String[] args )throws ClassNotFoundException , SQLException{
        getPreparedStatement("select * from users");
    }

}
