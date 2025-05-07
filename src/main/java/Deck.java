/**
 * @author Roy Edwin
*/  

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * This class makes a deck of playing cards.
 */
public class Deck {
    private ArrayList<Card> deck;

    /**
     * Makes a deck from a given list of cards.
     *
     * @param cards an array of cards to put in the deck
     */
    public Deck(Card[] cards) {
        this.deck = new ArrayList<Card>(Arrays.asList(cards));
    }

    /**
     * Makes a regular deck with 52 cards.
     */
    public Deck() {
        String[] names = new String[] {
            "Ace",
            "2",
            "3",
            "4",
            "5",
            "6",
            "7",
            "8",
            "9",
            "10",
            "Jack",
            "Queen",
            "King",
        };

        String[] suits = new String[] {
            "Hearts",
            "Clubs",
            "Diamonds",
            "Spades",
        };

        this.deck = new ArrayList<Card>();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                this.deck.add(new Card(names[j], suits[i], i + j * 4));
            }
        }
    }

    /**
     * Mixes up the order of the cards.
     */
    public void shuffle() {
        Collections.shuffle(this.deck);
    }

    /**
     * Takes the top card from the deck.
     *
     * @return the card that was taken, or null if the deck is empty
     */
    public Card draw() {
        if (this.deck.size() > 0) {
            return this.deck.remove(0);
        }
        return null;
    }

    /**
     * Tells how many cards are left in the deck.
     *
     * @return the number of cards in the deck
     */
    public int size() {
        return this.deck.size();
    }
}
