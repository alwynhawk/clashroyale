package com.company;

import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {




        System.out.println("How is your day going?: enter good or bad");
        Scanner scan = new Scanner(System.in);
        String day = scan.nextLine();
        if (day.equals("bad")) {
            System.out.println("Oh no! lets try a breathing exercise! (box breathing)");
           Thread.sleep(2000);
            int i = 0;
            while(i <= 2) {
                System.out.println("breath in");
                Thread.sleep(5000);
                System.out.println("hold");
                Thread.sleep(5000);
                System.out.println("breath out");
                Thread.sleep(5000);
                System.out.println("hold");
                Thread.sleep(5000);
                i++;

            }
            System.out.println("do you feel better?: enter yes or no");
            String better = scan.nextLine();
            if (better.equals("yes")) {
                System.out.println("Good bye! have a great knight!");
                System.out.println("  ,   A           {}\n" +
                        " / \\, | ,        .--.\n" +
                        "|    =|= >      /.--.\\\n" +
                        " \\ /` | `       |====|\n" +
                        "  `   |         |`::`|  \n" +
                        "      |     .-;`\\..../`;_.-^-._\n" +
                        "     /\\\\/  /  |...::..|`   :   `|\n" +
                        "     |:'\\ |   /'''::''|   .:.   |\n" +
                        "      \\ /\\;-,/\\   ::  |..:::::..|\n" +
                        "      |\\ <` >  >._::_.| ':::::' |\n" +
                        "      | `\"\"`  /   ^^  |   ':'   |\n" +
                        "      |       |       \\    :    /\n" +
                        "      |       |        \\   :   / \n" +
                        "      |       |___/\\___|`-.:.-`\n" +
                        "      |        \\_ || _/    `\n" +
                        "      |        <_ >< _>\n" +
                        "      |        |  ||  |\n" +
                        "      |        |  ||  |\n" +
                        "      |       _\\.:||:./_\n" +
                        "      |      /____/\\____\\");
            }
            else {
                System.out.println("have a grape day!!");
                System.out.println("                                                                         \n" +
                        "                                    ████                        ▓▓██            \n" +
                        "                                    ██░░██                  ████░░▓▓            \n" +
                        "                          ████████████░░░░████          ████░░░░▒▒██            \n" +
                        "                      ████▒▒▒▒▒▒▒▒▒▒██▒▒░░░░░░██████████░░░░░░▒▒▓▓              \n" +
                        "                    ▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▓▓██▒▒▒▒░░░░░░░░░░░░░░▒▒▒▒▓▓                \n" +
                        "                    ██▒▒    ▒▒▒▒▒▒▒▒▒▒▒▒██▒▒▒▒░░░░░░▒▒░░░░▒▒▒▒██                \n" +
                        "                  ▓▓▓▓▒▒    ▒▒▒▒▒▒▒▒▒▒▓▓▓▓████░░░░▒▒▒▒░░░░░░▒▒▒▒▓▓              \n" +
                        "                  ██▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▒▒▒▒▒▒██░░▒▒▒▒▒▒▒▒░░░░░░░░░░▓▓▓▓▓▓▓▓      \n" +
                        "                  ██▒▒▒▒▒▒▒▒▒▒▒▒▓▓▒▒▒▒▒▒▒▒▒▒██░░▒▒████▒▒▒▒▒▒░░░░░░░░░░░░▓▓      \n" +
                        "                  ██▓▓▒▒▒▒▒▒▒▒▒▒▓▓▒▒    ▒▒▒▒██▒▒██▒▒▒▒████▒▒▒▒▒▒▒▒▒▒▒▒▓▓        \n" +
                        "                  ██▓▓▒▒▒▒▒▒▒▒▓▓▒▒▒▒    ▒▒▒▒▒▒██▒▒▒▒▒▒▒▒▓▓████████▓▓▓▓          \n" +
                        "                  ██▓▓▓▓▒▒▒▒▒▒▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▒▒▒▒▓▓▓▓▓▓████              \n" +
                        "                    ██▓▓▓▓▒▒▒▒▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▒▒▓▓▓▓▓▓▓▓▓▓██            \n" +
                        "                    ██▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▒▒▓▓▓▓▓▓▒▒▒▒██            \n" +
                        "                  ▓▓▓▓▒▒▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▒▒▓▓▓▓▓▓▓▓▒▒▓▓██          \n" +
                        "                  ██▒▒▒▒▒▒▒▒▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▒▒▓▓▓▓▓▓▓▓▒▒▒▒██          \n" +
                        "                  ▓▓▒▒▒▒▒▒▒▒▒▒▓▓▓▓▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▓▓▓▓▓▓▓▓▓▓▒▒▒▒██          \n" +
                        "                  ██▓▓▒▒▒▒▒▒▒▒▓▓▓▓▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▒▒▒▒▓▓▓▓▓▓▓▓▓▓▒▒▒▒██          \n" +
                        "                  ▓▓▓▓▓▓▒▒▒▒▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒██          \n" +
                        "              ████▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▓▓            \n" +
                        "            ▓▓▓▓▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒██            \n" +
                        "            ▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▓▓▓▓              \n" +
                        "          ▓▓▒▒▒▒░░  ▒▒▒▒▒▒▒▒▒▒▓▓▓▓▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓                  \n" +
                        "          ▓▓▒▒▒▒    ▒▒▒▒▒▒▒▒▒▒▓▓▓▓▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓██                        \n" +
                        "          ▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▒▒▒▒▒▒▓▓▓▓▓▓▓▓▒▒██                          \n" +
                        "          ▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒██                          \n" +
                        "          ▓▓▒▒▓▓▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒██                            \n" +
                        "          ██▒▒▓▓▓▓▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒██                              \n" +
                        "            ██▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒████                                \n" +
                        "            ▓▓▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▓▓████████                                    \n" +
                        "              ▓▓▓▓▓▓▒▒▓▓▒▒▒▒▒▒▓▓▓▓░░░░▒▒░░                                      \n" +
                        "                  ▓▓▓▓▓▓▓▓▓▓▓▓                                                  \n" +
                        "                                                                                \n" +
                        "                                                                                \n" +
                        "                                                                               ");
            }





        }
        else {
            System.out.println("nice, we are going to play a number speed game now");
            Thread.sleep(2000);
            System.out.println("Im going to spit out a number, type it in as fast as possible!");
            Thread.sleep(3000);
            System.out.println("3");
            Thread.sleep(1000);
            System.out.println("2");
            Thread.sleep(1000);
            System.out.println("1");
            System.out.println(returnNumbers());
            int enteredNum = scan.nextInt();
            scan.nextLine();
            if (enteredNum == returnNumbers()) {
                System.out.println("nice job! see you later!");
            }
            else {
                System.out.println("nice job! see you later!");
            }



        }


    }

    private static int returnNumbers() {
        Random rand = new Random();
        int n = rand.nextInt(999);
        return n;
    }

}
