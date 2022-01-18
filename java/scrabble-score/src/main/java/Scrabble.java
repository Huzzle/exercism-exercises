import java.util.HashMap;

class Scrabble {
    private final HashMap<Character, Integer> points = new HashMap<>();
    private final String word;
    private final int wordLength;

    Scrabble(String word) {
        this.word = word.toLowerCase();
        this.wordLength = word.length();

        this.points.put('a', 1);
        this.points.put('b', 3);
        this.points.put('c', 3);
        this.points.put('d', 2);
        this.points.put('e', 1);
        this.points.put('f', 4);
        this.points.put('g', 2);
        this.points.put('h', 4);
        this.points.put('j', 8);
        this.points.put('k', 5);
        this.points.put('l', 1);
        this.points.put('m', 3);
        this.points.put('n', 1);
        this.points.put('i', 1);
        this.points.put('o', 1);
        this.points.put('p', 3);
        this.points.put('r', 1);
        this.points.put('s', 1);
        this.points.put('t', 1);
        this.points.put('u', 1);
        this.points.put('v', 4);
        this.points.put('w', 4);
        this.points.put('q', 10);
        this.points.put('x', 8);
        this.points.put('y', 4);
        this.points.put('z', 10);
    }

    int getScore() {
        int score = 0;

        for (int i = 0; i < this.wordLength; i++) {
            char ch = this.word.charAt(i);
            score += this.points.get(ch);
        }

        return score;
    }
}
