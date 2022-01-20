class SqueakyClean {
    static String clean(String identifier) {
        StringBuilder cleaned = new StringBuilder();
        boolean toUpperCase = false;

        for (char ch : identifier.toCharArray()) {
            if (Character.isWhitespace(ch)) {
                cleaned.append("_");
            } else if (Character.isISOControl(ch)) {
                cleaned.append("CTRL");
            } else if (ch >= 'α' && ch <= 'ω') {
                continue;
            } else if (Character.isLetter(ch)) {
                cleaned.append(toUpperCase ? Character.toUpperCase(ch) : ch);
            }

            toUpperCase = ch == '-';
        }

        return cleaned.toString();
    }
}
