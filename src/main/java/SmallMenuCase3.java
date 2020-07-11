import database.Slip;
import http.SlipDto;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SmallMenuCase3 {
    private final AdviceService adviceService;
    public SmallMenuCase3 (AdviceService adviceService) {
        this.adviceService = adviceService;
    }


    public void smallMenu3() {
        boolean doContiunue = true;
        SlipDto randomAdvice = adviceService.getRandomAdvice();
        while (doContiunue) {
            System.out.println("SmallMenuCase3");
            System.out.println("Choose one of the options");
            System.out.println("1. View my favorites *Advice*");
            System.out.println("2. Delete favorites *Advice* to database/ id number ");
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
                    System.out.println( "Your " );
                    System.out.println( "     favorites  " );
                    System.out.println( "               *Advice*" );
                    List<Slip> list = adviceService.getAllAdvices();
                    System.out.println(Arrays.toString(list.toArray()));
                    System.out.println( "Your " );
                    System.out.println( "     favorites  " );
                    System.out.println( "               *Advice*" );
                    break;
                }
                case 2: {
                    System.out.println(" :( " );
                    System.out.println("Delete your favorite *Advice* from the database / id number " );
                    System.out.println(" :( " );


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