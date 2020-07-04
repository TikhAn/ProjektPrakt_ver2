
import java.util.Scanner;

public class Menu {

    private final AdviseService adviseService;

    public Menu(AdviseService adviseService) {
        this.adviseService = adviseService;
    }

    public void displayMenu() {

        boolean continuing = true;

        while(continuing) {
            System.out.println("AdviceBook");
            System.out.println("Wybierz jedną z opcji");
            System.out.println("1. Wylosuj cytat");
            System.out.println("2. Wyszukaj cytat");
            System.out.println("3. Moje cytaty"); // export, wyswietlanie, usuwanie cytatów
            System.out.println("0. Zakończ");

            int option=-1;
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextInt()) {
                option = scanner.nextInt();
            } else {

            }
            switch(option) {
                case 0: {
                    continuing=false;
                    break;
                }
                case 1: {
                    System.out.println("******Cytat dla Ciebie******");
                    System.out.println(adviseService.getRandomAdvice().getAdvice());
                    System.out.println("******");
                    break;
                }
                case 2: {
                    System.out.println("Praca w toku...");
                    break;
                }
                case 3: {
                    System.out.println("Praca w toku...");

                    break;
                }
                case -1: {
                    System.out.println("Wpisz liczbe!");

                    break;
                }
                default: {
                    System.out.println("Funkcja nieobslugiwana - wybierz inny numer");

                }

            }
        }
    }


}
