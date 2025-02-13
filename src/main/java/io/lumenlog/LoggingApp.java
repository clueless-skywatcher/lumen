package io.lumenlog;

/**
 * Hello world!
 *
 */
public class LoggingApp
{
    public static void main( String[] args )
    {
        ILogger logger = new ConsoleLogger();
        logger.info("Info");
        logger.debug("Debug");
        logger.warn("Warning");
        logger.error("Error");
    }
}
