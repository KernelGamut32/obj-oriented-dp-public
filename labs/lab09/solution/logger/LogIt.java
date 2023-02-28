package labs.lab09.solution.logger;

public class LogIt {
    public static void main(String[] args) {
        LoggerFactory loggerFactory = new LoggerFactory();

        Logger loggerOne = loggerFactory.getLogger("CONSOLE");
        Logger loggerTwo = loggerFactory.getLogger("ERROR");

        loggerOne.error("Message for logger one");
        loggerOne.warn("Message for logger one");
        loggerOne.info("Message for logger one");
        loggerOne.debug("Message for logger one");

        loggerTwo.error("Message for logger two");
        loggerTwo.warn("Message for logger two");
        loggerTwo.info("Message for logger two");
        loggerTwo.debug("Message for logger two");
    }
}
