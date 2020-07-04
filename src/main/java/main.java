import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class main {
    public static void main(String[] args) {
        System.out.println("Hej");

try {
    URL url = new URL("https://api.adviceslip.com/advice");
    HttpURLConnection connection = url.openConnection();
    connection.setRequestMethod("Get");

    BufferedReader in = new BufferedReader(new InputStreamReader())


} catch () catch (MalformedURLException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}

    }
}
