class RotationalCipher {
    private final int shiftKey;

    RotationalCipher(int shiftKey) {
        this.shiftKey = shiftKey;
    }

    String rotate(String data) {
        StringBuilder rotated = new StringBuilder();

        for (char ch : data.toCharArray()) {
            if (Character.isLetter(ch)) {
                char rotatedChar = this.rotateChar(ch);
                rotated.append(rotatedChar);
            } else {
                rotated.append(ch);
            }
        }

        return rotated.toString();
    }

    private char rotateChar(char ch) {
        char firstAlphabetChar = Character.isUpperCase(ch) ? 'A' : 'a';
        int rotatedCharCode = firstAlphabetChar + (ch + this.shiftKey - firstAlphabetChar) % 26;

        return (char) rotatedCharCode;
    }
}
