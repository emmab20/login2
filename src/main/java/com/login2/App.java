package com.login2;

/**
 * Login
 *
 */
public class App {
    public static void login(String username, String password) {
        if (username.equals("neo") && password.equals("followthewhiterabbit")) {
            System.out.println("Welcome, Neo");
        } else {
            System.out.println("Invalid username or password");
        }
    }

    public static void main(String[] args) {
        login("neo", "badpassword");
        login("badusername", "followthewhiterabbit");
        login("neo", "followthewhiterabbit");
    }
}
