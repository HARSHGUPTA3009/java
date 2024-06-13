public class TilePlacement {

    public static int countWays(int n, int m) {
        if (n < m) {
            // If the floor width is less than the tile width,
            // there's no way to place the tiles.
            return 0;
        } else if (n == m) {
            // If the floor width is equal to the tile width,
            // there's only one way to place the tiles.
            return 1;
        } else {
            // Recursive case: place the first tile vertically (1 x m) or horizontally (n x m),
            // and then recursively count ways for the remaining (n-1) x m or (n-m) x m floor.
            return countWays(n - 1, m) + countWays(n - m, m);
        }
    }

    public static void main(String[] args) {
        int n = 9; // Floor length
        int m = 4; // Tile length
        int ways = countWays(n, m);
        System.out.println("Number of ways to place tiles: " + ways);
    }
}
