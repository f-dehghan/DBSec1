package model;

/**
 * Created by Fatemeh on 12/5/2016.
 */
public class users {
    private String username;
    private String pass;
    private int asl;
    private int rsl;
    private int wsl;
    private int ail;
    private int ril;
    private int wil;


    public users(String username, String pass , int asl , int rsl , int wsl , int ail , int ril , int wil) {
        this.username = username;
        this.pass = pass;
        this.asl = asl;
        this.rsl =  rsl;
        this.wsl =  wsl;
        this.ail =  ail;
        this.ril =  ril;
        this.wil =  wil;

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getAsl() {
        return asl;
    }

    public void setAsl(int asl) {
        this.asl = asl;
    }

    public int getRsl() {
        return rsl;
    }

    public void setRsl(int rsl) {
        this.rsl = rsl;
    }

    public int getWsl() {
        return wsl;
    }

    public void setWsl(int wsl) {
        this.wsl = wsl;
    }

    public int getAil() {
        return ail;
    }

    public void setAil(int ail) {
        this.ail = ail;
    }

    public int getRil() {
        return ril;
    }

    public void setRil(int ril) {
        this.ril = ril;
    }

    public int getWil() {
        return wil;
    }

    public void setWil(int wil) {
        this.wil = wil;
    }
}
