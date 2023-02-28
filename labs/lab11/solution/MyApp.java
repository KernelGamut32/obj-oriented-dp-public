package labs.lab11.solution;

class MyApp {
    public static void main(String[] args) {
        // Configuration config = new Configuration();
        Configuration configOne = Configuration.getInstance();
        Configuration configTwo = Configuration.getInstance();
        Configuration configThree = Configuration.getInstance();

        System.out.println(configOne.getSettings());
        System.out.println(configTwo.getSettings());
        System.out.println(configThree.getSettings());
    }    
}
