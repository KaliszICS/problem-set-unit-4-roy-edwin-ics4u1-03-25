import java.util.ArrayList;
import java.util.Arrays;

/**
 * The DiscardPile class handles the discarding of used Cards.
 * Values of null are ignored.
 * 
 * @author Roy Edwin
 */
public class DiscardPile {
    
    private ArrayList<Card> pile;

    /**
     * Creates a new DiscardPile object.
     */
    public DiscardPile() {
        pile = new ArrayList<Card>();
    }

    /**
     * Creates a new DiscardPile object with some cards.
     * 
     * @param cards the Array of cards to initialize the DiscardPile with.
     */
    public DiscardPile(Card[] cards) {
        pile = new ArrayList<Card>(Arrays.asList(cards));
    }

    /**
     * Gets the DiscardPile object's contents in an Array.
     * @return an Array of all the Cards in the DiscardPile
     */
    public Card[] getDiscardPile() {
        return (Card[]) pile.toArray();
    }

    /**
     * Gets the number of Card objects in the DiscardPile.
     * 
     * @return the size of the DiscardPile.
     */
    public int size() {
        return pile.size();
    }

    /**
     * Adds a card to the discard pile.
     * Values that are null are ignored.
     * 
     * @param card
     */
    public void addCard(Card card) {
        if (card == null) {return;}
        pile.add(card);
    }

    /**
     * Attempts to remove a Card from the deck and if successful, returns it.
     * This method may act weird when dealing with null values because
     * if null is passed, null is returned which may be interpreted as successful.
     * 
     * @param card the Card to remove
     * @return the Card if it was found
     */

    public Card removeCard(Card card) {
        if (card == null) { return null; }
        if (pile.remove(card)) {
            return card;
        }
        return null;
    }

    /**
     * Removes all the cards from the DiscardPile and returns them in an Array.
     * @return the Array of all removed cards.
     */
    public Card[] removeAll() {

        Card[] removedCards = new Card[pile.size()];
        int index = 0;
        while (pile.size() > 0) {
            removedCards[index] = pile.get(0);
            index += 1;
            pile.remove(0);
        }

        return removedCards;
    }

    /**
     * Shows the DiscardPile as a sentence.
     * 
     * @return the converted String sentence
     */
    @Override
    public String toString() {
        String convertedString = "";

        for (int i = 0; i < pile.size(); i++) {

            convertedString += pile.get(i);
            // Add a comma if there is another element
            if (pile.size() != i + 1) {
                convertedString += ", ";
            }
        }

        return convertedString;
    }


    
}
