import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class main {
    public static void main(String[] args) {
        System.out.println("Hej");
try {
    URL url = new URL("https://api.adviceslip.com/advice");
    HttpURLConnection connection = url.openConnection();
    connection.setRequestMethod();
} catch () catch (MalformedURLException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}

    }
}
