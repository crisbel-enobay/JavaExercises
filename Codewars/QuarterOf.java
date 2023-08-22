public class QuarterOf {
    public static void main(String[] args) {
        System.out.println(quarterOf(1));
        System.out.println(quarterOf(6));
        System.out.println(quarterOf(9));
        System.out.println(quarterOf(11));

    }

    public static int quarterOf(int month) {
        int firstMonth = 3;
        int secondMonth = 6;
        int thirdMonth = 9;

        if (month <= firstMonth) {
            return 1;
        } else if (month <= secondMonth) {
            return 2;
        } else if (month <= thirdMonth) {
            return 3;
        } else {
            return 4;
        }
    }
}