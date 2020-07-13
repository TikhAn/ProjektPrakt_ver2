
import database.Slip;
import http.SlipNotFoundException;
import http.SlipDto;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Menu {

    public final AdviceService adviceService;
    public final AdviceClient adviceClient;
    public final AdviceExporter adviceExporter;

    public Menu(AdviceService adviceService, AdviceClient adviceClient, AdviceExporter adviceExporter) {
        this.adviceService = adviceService;
        this.adviceClient = adviceClient;
        this.adviceExporter = adviceExporter;
    }

    //user menu
    public void displayMenu() throws SlipNotFoundException {
        boolean doContinue = true;

        while (doContinue) {
            System.out.println("");
            System.out.println("Great advice for every day");
            System.out.println("Choose one of the options:");
            System.out.println("1. Random advice");
            System.out.println("2. Search for advice by id or topic");
            System.out.println("3. Saved quotes");  //in next step we can export saved quotes to file or delete them
            System.out.println("0. Exit");
            int nextInt = -1;
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextInt()) {
                nextInt = scanner.nextInt();
            }


            //what to do after user choice
            switch (nextInt) {
                case 1: {
                    SlipDto randomAdvice = adviceClient.getRandomAdvice();
                    String advice = randomAdvice.getAdvice();
                    System.out.println("");
                    System.out.println("******Advice for you ******");
                    System.out.println(advice);
                    System.out.println("******************************");

                    SmallMenuCase1 smallMenu = new SmallMenuCase1(adviceService);
                    smallMenu.smallMenu1(randomAdvice);
                    break;
                }
                case 2: {
                    System.out.println("What are you looking for?");
                    String search = scanner.next();

                    try {
                        int searchInt = Integer.parseInt(search);
                        //System.out.println(adviceService.searchById(nextInt));

                    } catch (NumberFormatException e) {
                        System.out.println(adviceClient.searchByString(search));
                    }
                    break;
                }

                case 3: {
                    AdviceExporter adviceExporter = new AdviceExporter();
                    break;
                }

                case 4: {
                    List<Slip> allAdvices = adviceService.getAllAdvices();
                    System.out.println(Arrays.toString(allAdvices.toArray()));
                    break;
                }
                case 0: {
                    doContinue = false;
                    break;
                }
                default: {
                    System.out.println("Wrong command");
                }
            }
        }
    }
}