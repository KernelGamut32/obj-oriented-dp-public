package labs.lab09.solution.logger;

interface Logger {
    void error(String message);
    void warn(String message);
    void info(String message);
    void debug(String message);
}
