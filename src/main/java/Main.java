import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

class Main {


    public static void main(String[] args) {

        Menu menu = new Menu(new AdviseService());
        menu.displayMenu();

    }
}