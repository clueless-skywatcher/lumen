package io.lumenlog;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ConsoleLogger implements ILogger {
    @Override
    public void log(String message, LogLevel level, LogColor color) {
        int colorNum = color.getColorNum();
        String timeStamp = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss").format(new Date());
        System.out.println(String.format("%s \033[%dm%s\033[0m: %s", timeStamp, colorNum, level.toString(), message));
    }
}
