public class Blackjack {
    private final int BLACKJACK = 21;
    private final String STAND = "S";
    private final String HIT = "H";
    private final String SPLIT = "P";
    private final String WIN = "W";

    public int parseCard(String card) {
        switch (card) {
            case "two":
                return 2;
            case "three":
                return 3;
            case "four":
                return 4;
            case "five":
                return 5;
            case "six":
                return 6;
            case "seven":
                return 7;
            case "eight":
                return 8;
            case "nine":
                return 9;
            case "ten":
            case "jack":
            case "queen":
            case "king":
                return 10;
            case "ace":
                return 11;
            default:
                return 0;
        }
    }

    public boolean isBlackjack(String card1, String card2) {
        return this.parseCard(card1) + this.parseCard(card2) == BLACKJACK;
    }

    public String largeHand(boolean isBlackjack, int dealerScore) {
        if (!isBlackjack) {
            return SPLIT;
        }

        if (dealerScore < 10) {
            return WIN;
        }

        return STAND;
    }

    public String smallHand(int handScore, int dealerScore) {
        if (handScore >= 17) {
            return STAND;
        }

        if (handScore <= 11) {
            return HIT;
        }

        if (dealerScore >= 7) {
            return HIT;
        }

        return STAND;
    }

    // FirstTurn returns the semi-optimal decision for the first turn, given the cards of the player and the dealer.
    public String firstTurn(String card1, String card2, String dealerCard) {
        int handScore = parseCard(card1) + parseCard(card2);
        int dealerScore = parseCard(dealerCard);

        if (20 < handScore) {
            return largeHand(isBlackjack(card1, card2), dealerScore);
        } else {
            return smallHand(handScore, dealerScore);
        }
    }
}
