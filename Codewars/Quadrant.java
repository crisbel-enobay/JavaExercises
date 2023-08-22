public class Quadrant {
    public static void main(String[] args) {
        System.out.println(quadrant(1, 2));
        System.out.println(quadrant(3, 5));
        System.out.println(quadrant(-10, 100));
        System.out.println(quadrant(-1, -9));
        System.out.println(quadrant(19, -56));
    }

    public static int quadrant(int x, int y) {
        int zero = 0;

        if (x >= zero && y >= zero) {
            return 1;
        } else if (x < zero && y >= zero) {
            return 2;
        } else if (x >= zero && y < zero) {
            return 4;
        } else {
            return 3;
        }
    }
}