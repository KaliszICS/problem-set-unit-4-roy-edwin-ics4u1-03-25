/**
 * @author Roy Edwin
*/  

/**
 * This class makes a playing card with a name, suit, and value.
 */
public class Card {

    private String name;
    private String suit;
    private int value;

    /**
     * Creates a new card with a name, suit, and value.
     *
     * @param name the name of the card (like \"Ace\" or \"10\")
     * @param suit the suit of the card (like \"Hearts\" or \"Spades\")
     * @param value the value of the card (used for comparing cards)
     */
    public Card(String name, String suit, int value) {
        this.name = name;
        this.suit = suit;
        this.value = value;
    }

    /**
     * Gets the name of the card.
     *
     * @return the name of the card
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the suit of the card.
     *
     * @return the suit of the card
     */
    public String getSuit() {
        return suit;
    }

    /**
     * Gets the value of the card.
     *
     * @return the value of the card
     */
    public int getValue() {
        return value;
    }

    /**
     * Shows the card as a simple sentence.
     *
     * @return a string like \"Ace of Hearts\"
     */
    @Override
    public String toString() {
        return this.name + " of " + this.suit;
    }

    /**
     * Checks if this card is the same as another card.
     *
     * @param obj the object to compare
     * @return true if both cards are the same, false if they are different
     */
    @Override
    public boolean equals(Object obj) {
        Card other = (Card) obj;
        return this.name.equals(other.getName()) && this.suit.equals(other.getSuit()) && this.value == other.getValue();
    }
}
