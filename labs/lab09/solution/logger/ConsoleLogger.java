package labs.lab09.solution.logger;

public class ConsoleLogger implements Logger {
    public void error(String message) {
        System.out.println("ERROR:" + message);
    }
    public void warn(String message) {
        System.out.println("WARN:" + message);
    }

    public void info(String message) {
        System.out.println("INFO:" + message);
    }

    public void debug(String message) {
        System.out.println("DEBUG:" + message);
    }
}
