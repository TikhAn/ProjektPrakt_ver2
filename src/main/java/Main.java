import http.SlipNotFoundException;

public class Main {


    public static void main(String[] args) throws SlipNotFoundException {

        Menu menu = new Menu(new AdviceService(), new AdviceClient(), new AdviceExporter());
        menu.displayMenu();
    }
}