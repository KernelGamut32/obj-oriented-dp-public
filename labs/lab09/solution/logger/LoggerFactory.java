package labs.lab09.solution.logger;

public class LoggerFactory {
    public Logger getLogger(String type) {
        if (type.equals("CONSOLE")) {
            return new ConsoleLogger();
        } else if (type.equals("ERROR")) {
            return new ErrorLogger();
        } else {
            return null;
        }
    }
}
