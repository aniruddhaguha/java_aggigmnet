public class CountNotes {
    public static void main(String[] args) {
        int[] denominations = {1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
        int[] notesCount = new int[denominations.length];
        int amount = 562;

        for (int i = 0; i < denominations.length; i++) {
            notesCount[i] = amount / denominations[i];
            amount %= denominations[i];
        }

        System.out.println("Output:");
        for (int i = 0; i < denominations.length; i++) {
            if (notesCount[i] > 0) {
                System.out.println(denominations[i] + " " + notesCount[i]);
            }
        }
    }
}
