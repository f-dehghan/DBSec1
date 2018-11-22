package dao;


import model.users;
import mydatabase.dbClass;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by Fatemeh on 12/5/2016.
 */
public class dataAccess {


    public users findUser(String username, String password) {
        try {

            PreparedStatement ps = dbClass.getPreparedStatement(
                    "select * from users where username = ? and pass = ?");

            ps.setString(1, username);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();
            int mycount = 0;
            users u = null;
            while (rs.next()) {
                mycount++;
                System.out.println("mycount=" + mycount);
                u = new users( rs.getString(1), rs.getString(2), rs.getInt(3),rs.getInt(4),rs.getInt(5),rs.getInt(6),rs.getInt(7),rs.getInt(8));
                if (mycount > 0)
                    return u;
                else
                    u = null ;
            }

            return null;

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(dataAccess.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public ResultSet  executeQuery(String query) {
        try {

            PreparedStatement ps = dbClass.getPreparedStatement(query);

            ResultSet rs = ps.executeQuery();

            return rs;

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(dataAccess.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }


}