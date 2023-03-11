public class CardsMain {
    public static void main(String[] args) {
        DeckOfCards deckOfCards=new DeckOfCards();
        System.out.println("welcome to the card game : \n..............................");
        deckOfCards.initialise();
        deckOfCards.shuffle();
        deckOfCards.print();
        System.out.println("---------------After Shuffle-----------");
        deckOfCards.print();
        deckOfCards.distribute();
        deckOfCards.printDistributedCards();
    }
}
