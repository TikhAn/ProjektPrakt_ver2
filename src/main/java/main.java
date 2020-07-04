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

    BufferedReader in = new BufferedReader(new InputStreamReader(connection.getErrorStream()));
    String inputline;
    StringBuffer content = new StringBuffer();
    while ((inputline=in.readLine()) !=null){
        content.append(inputline);

    }
System.out.println(content.toString());
    in.close();

} catch () catch (MalformedURLException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}

    }
}
