package org.vashonsd;

import java.util.HashMap;
import java.util.Map;

public class Card {
    String name;
    Map<Trait, Boolean> traits = new HashMap<>();

    public Card(String name) {
        this.name = name;
    }

    public void updateTrait(Trait trait, Boolean bool) {
        traits.put(trait, bool);
    }

    @Override
    public String toString() {
        return "Card{" +
                "name='" + name + '\'' +
                ", traits=" + traits +
                '}';
    }

    public Boolean getTrait(Trait t) {
        return traits.get(t);
    }
}
