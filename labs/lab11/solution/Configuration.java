package labs.lab11.solution;

class Configuration {
    private static Configuration instance;
    private String settings = "DATABASE SERVER=ABC;HOST=1.1.1.1";

    private Configuration() {

    }

    public static Configuration getInstance() {
        if (instance == null) {
            instance = new Configuration();
        }
        return instance;
    }

    public String getSettings() {
        return this.settings;
    }
}
