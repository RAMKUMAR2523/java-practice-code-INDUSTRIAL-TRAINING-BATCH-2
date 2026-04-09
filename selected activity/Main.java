
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of activities: ");
        int n = sc.nextInt();

        int[] start = new int[n];
        int[] finish = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("Enter start and finish time for activity " + i + ": ");
            start[i] = sc.nextInt();
            finish[i] = sc.nextInt();
        }

int lastFinish = finish[0];

        System.out.println("\nSelected activities:");
        System.out.println("Activity 0 (Start=" + start[0] + ", Finish=" + finish[0] + ")");

        for (int i = 1; i < n; i++) {
            if (start[i] >= lastFinish) {
                System.out.println("Activity " + i +
                        " (Start=" + start[i] +
                        ", Finish=" + finish[i] + ")");
                lastFinish = finish[i];
            }
        }

    }
}