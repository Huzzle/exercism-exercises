import java.util.ArrayList;
import java.util.HashMap;

class Matrix {
    private final HashMap<Integer, ArrayList<Integer>> rows;
    private final HashMap<Integer, ArrayList<Integer>> columns;

    Matrix(String matrixAsString) {
        String currentNumber = "";
        int rowIndex = 1;
        int columnIndex = 1;
        int length = matrixAsString.length();
        this.rows = new HashMap<>();
        this.columns = new HashMap<>();
        this.rows.put(rowIndex, new ArrayList<Integer>());
        this.columns.put(columnIndex, new ArrayList<Integer>());

        for (int i = 0; i < length; i++) {
            char ch = matrixAsString.charAt(i);
            boolean isLastSymbol = i == length - 1;

            if (Character.isDigit(ch)) {
                currentNumber += ch;
            }

            if (Character.isWhitespace(ch) || isLastSymbol) {
                if (!this.rows.containsKey(rowIndex)) {
                    this.rows.put(rowIndex, new ArrayList<Integer>());
                }

                if (!this.columns.containsKey(columnIndex)) {
                    this.columns.put(columnIndex, new ArrayList<Integer>());
                }

                this.rows.get(rowIndex).add(Integer.parseInt(currentNumber));
                this.columns.get(columnIndex).add(Integer.parseInt(currentNumber));
                columnIndex++;
                currentNumber = "";
            }

            if (ch == '\n') {
                columnIndex = 1;
                rowIndex++;
            }
        }
    }

    int[] getRow(int rowNumber) {
        return this.rows.get(rowNumber).stream().mapToInt(i -> i).toArray();
    }

    int[] getColumn(int columnNumber) {
        return this.columns.get(columnNumber).stream().mapToInt(i -> i).toArray();
    }
}
