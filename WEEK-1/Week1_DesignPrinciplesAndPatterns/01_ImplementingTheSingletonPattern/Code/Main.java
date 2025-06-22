public class Main {

    public static void main(String[] args) {
        LogManager logA = LogManager.getLogger();
        logA.write("Logging first activity.");

        LogManager logB = LogManager.getLogger();
        logB.write("Logging second activity.");

        if (logA == logB) {
            System.out.println("Same LogManager instance is reused.");
        } else {
            System.out.println("Different instances exist.");
        }
    }
}
