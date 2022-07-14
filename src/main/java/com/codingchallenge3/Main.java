package main.java.com.codingchallenge3;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello world!");
        ATM atm = new ATM(100.0, "USD");
        atm.exchangeCurrency("huh");
    }
}