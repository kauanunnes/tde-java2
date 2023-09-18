public class SolveGame {

    public static int countMoves;

    public static void solve(int n, Stack source, Stack destination, Stack aux, boolean ascending) {
        if (n == 1) {
            Integer disc = source.remove();
            if (ascending) {
                destination.insertCrescent(disc);
            } else {
                destination.insertDescending(disc);
            }
            countMoves++;
        } else {
            solve(n - 1, source, aux, destination, ascending);
            Integer disc = source.remove();
            if (ascending) {
                destination.insertCrescent(disc);
            } else {
                destination.insertDescending(disc);
            }
            countMoves++;
            solve(n - 1, aux, destination, source, ascending);
        }
    }
}
