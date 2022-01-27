package org.vashonsd;
import java.util.Objects;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Card dragon = new Card("Red Dragon");
        dragon.updateTrait(Trait.ATHLETIC, false);
        dragon.updateTrait(Trait.MORNING, false);
        Card wizard = new Card("Wizard");
        wizard.updateTrait(Trait.ATHLETIC, false);
        wizard.updateTrait(Trait.MORNING, true);
        CardList masterList = new CardList();
        masterList.addCard(dragon);
        masterList.addCard(wizard);
//        System.out.println(masterList);
        System.out.println(masterList.getCardsWhere(Trait.ATHLETIC, false));
        System.out.println(masterList.getCardsWhere(Trait.MORNING, true));

        //Wish list for this program:
        //Learn to store and retrieve the data in a JSON file.

        //Next:
        //Have two cards duel.



//        System.out.println("take the test to see which clash royale card you are!");
//        System.out.println("do you want to start? (hint, type yes)");
//        Scanner scan = new Scanner(System.in);
//        String object = scan.nextLine();
//        System.out.println("Question 1: Are you a morning person");
//        String Q1 = scan.nextLine();
//
//        if(Objects.equals(Q1, "yes")) {
//            System.out.println("yes");
//        }
//        else {
//            System.out.println("no");
//        }



    }
}
