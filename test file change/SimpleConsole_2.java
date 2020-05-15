package src;

public class Example {
	// вызов метода main().
	public static void main(String args[]) {
		logger.log("Простая программа на Javas.");
	}
	
	public static int ung(int vor1, int vor2) {
        int tempRezults = vor1 / vor2;
        logger.log("Rezults = " + tempRezults);
        return tempRezults;
    }
	
	public static int min(int vor1, int vor2) {
        int tempRezults = vor1 + vor2;
        logger.log("Rezults = " + tempRezults);
        return tempRezults;
    }
	
	public static int max(int vor1, int vor2) {
        int tempRezults = vor1 * vor2;
        logger.log("Rezults = " + tempRezults);
        return tempRezults;
    }
}