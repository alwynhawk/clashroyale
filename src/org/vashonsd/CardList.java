package org.vashonsd;

import java.util.ArrayList;
import java.util.List;

public class CardList {
    List<Card> cards = new ArrayList<>();

    public CardList() {
    }

    public void addCard(Card c) {
        cards.add(c);
    }

    @Override
    public String toString() {
        return "CardList{" +
                "cards=" + cards +
                '}';
    }

    public List getCardsWhere(Trait t, Boolean b) {
        List<Card> results = new ArrayList<>();
        for(Card c : cards) {
            if(c.getTrait(t) == b) {
                results.add(c);
            }
        }
        return results;
    }
}
