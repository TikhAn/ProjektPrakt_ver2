import http.SlipDto;

import java.util.Scanner;

public class SmallMenuCase1 {
    private final AdviceService adviceService;
    public SmallMenuCase1 (AdviceService adviceService) {
        this.adviceService = adviceService;
    }
    public void smallMenu1(SlipDto randomAdvice) {
        boolean doContiunue = true;
        while (doContiunue) {
            System.out.println();
            System.out.println("Choose one of the options:");
            System.out.println("1. Write next advice");
            System.out.println("2. Add to database");
            System.out.println("0. Back to Main Menu");
            int smallOption = -1; //zabezpieczenie przed wpisaniem czegoś innego niż liczba
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextInt()) {
                smallOption = scanner.nextInt();
            }
            switch (smallOption) {
                case 0: {
                    doContiunue = false;
                    break;
                }
                case 1: {
                    randomAdvice = adviceService.getRandomAdvice();
                    String advice = randomAdvice.getAdvice();
                    System.out.println("");
                    System.out.println("****** Advice for you ******");
                    System.out.println(advice);
                    System.out.println("******************************");
                    break;
                }
                case 2: {
                   // dodanie do BD, do ulubionych
//                    SlipDto randomAdvice = adviceService.getRandomAdvice();
//                    String advice = randomAdvice.getAdvice();
                    adviceService.saveAdvice(randomAdvice); //to co przyszło z sieci zapisujemy do bazy danych
                    System.out.println("Advice was saved to your database ");
                    break;
                }
                case -1: {
                    System.out.println("Write a number!");
                    break;
                }
                default: {
                    System.out.println("Wrong command");
                }
            }
        }
    }
}

