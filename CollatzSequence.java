import java.util.Scanner;

class CollatzSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nunber = scanner.nextInt();
        scanner.close();
        while (nunber != 1) {
            System.out.print(nunber + " ");
            if (nunber % 2 == 0) {
                nunber = nunber / 2;
            } else {
                nunber = 3 * nunber + 1;
            }
        }
        System.out.print(nunber);
    }
}
