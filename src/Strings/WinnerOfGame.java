package Strings;

public class WinnerOfGame {

    public boolean winnerOfGame(String colors) {
        //check notes for intuition
        int n = colors.length();
        int alice = 0;
        int bob = 0;

        for (int i = 1; i < n - 1; i++) {

            if (colors.charAt(i-1) == colors.charAt(i) && colors.charAt(i) == colors.charAt(i + 1)) {
                if (colors.charAt(i) == 'A') {
                    alice++;
                } else {
                    bob++;
                }
            }
        }

        return alice > bob;
    }
}
