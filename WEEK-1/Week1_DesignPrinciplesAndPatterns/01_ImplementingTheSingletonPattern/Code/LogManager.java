public class LogManager {

    private static LogManager singleInstance;

    private LogManager() {
        System.out.println("LogManager object created.");
    }

    public static LogManager getLogger() {
        if (singleInstance == null) {
            singleInstance = new LogManager();
        }
        return singleInstance;
    }

    public void write(String text) {
        System.out.println("Message: " + text);
    }
}
