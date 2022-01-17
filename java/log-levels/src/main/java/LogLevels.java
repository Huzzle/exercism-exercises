public class LogLevels {
    
    public static String message(String logLine) {
        int doubleDotsIndex = logLine.indexOf(":");
        return logLine.substring(doubleDotsIndex + 1).trim();
    }

    public static String logLevel(String logLine) {
        int closeBracketIndex = logLine.indexOf("]");
        return logLine.substring(1, closeBracketIndex).toLowerCase();
    }

    public static String reformat(String logLine) {
        String message = LogLevels.message(logLine);
        String logLevel = LogLevels.logLevel(logLine);
        return "%s (%s)".formatted(message, logLevel);
    }
}
