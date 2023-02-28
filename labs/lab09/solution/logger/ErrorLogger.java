package labs.lab09.solution.logger;

public class ErrorLogger implements Logger {
    public void error(String message) {
        System.out.println("ERROR:" + message);
    }

    public void warn(String message) {
        error(message);
    }

    public void info(String message) {
        error(message);
    }

    public void debug(String message) {
        error(message);
    }
}
