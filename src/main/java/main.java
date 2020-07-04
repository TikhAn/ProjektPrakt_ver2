import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

class Main {

    private static final String URL = "https://api.adviceslip.com/";

    public static void main(String[] args) {

        HttpClient httpClient = new HttpClient();
        Slip slip = httpClient.fetch(URL+"advice", SlipResponse.class).getSlip();
        System.out.println(slip.getAdvice());

    }
}