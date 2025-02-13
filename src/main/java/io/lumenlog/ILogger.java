package io.lumenlog;

public interface ILogger {
    void log(String message, LogLevel level, LogColor color);

    default void info(String message) {
        log(message, LogLevel.INFO, LogColor.GREEN);
    }

    default void debug(String message) {
        log(message, LogLevel.DEBUG, LogColor.CYAN);
    }

    default void warn(String message) {
        log(message, LogLevel.WARNING, LogColor.YELLOW);
    }

    default void error(String message) {
        log(message, LogLevel.ERROR, LogColor.RED);
    }
}
