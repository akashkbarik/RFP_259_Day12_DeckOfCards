public class DeckOfCards {
    static final String[] SUIT = {"Clubs", "Diamonds", "Hearts", "Spades"};
    static final String[] RANK = {"2", "3", "4", "5", "6", "7", "8",
            "9", "10", "Jack", "Queen", "King", "Ace"};

    String[] deck = new String[52];
    String[][] playersCards = new String[4][9];
    int distributedIndex;

    public void initialise() {
        for (int i = 0; i < deck.length; i++) {
            deck[i] = RANK[i % 13] + SUIT[i / 13];
        }
    }

    public void shuffle() {
        for (int i = 0; i < deck.length; i++) {
            int randomIndex = (int) (Math.random() * deck.length);
            String temp = deck[i];
            deck[i] = deck[randomIndex];
            deck[randomIndex] = temp;
        }
    }

    public void print() {
        for (int i = 0; i < deck.length; i++) {
            System.out.println(deck[i]);
        }
    }

    public void distribute() {
        for (int j = 0; j < 9; j++) {
            for (int i = 0; i < 4; i++) {
                playersCards[i][j] = deck[distributedIndex++];
            }
        }
    }

    public void printDistributedCards() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(playersCards[i][j] + "    ");
            }
            System.out.println("\n");
        }
    }
}
