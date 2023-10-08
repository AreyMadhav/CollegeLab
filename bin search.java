import java.util.Scanner;

public class unknown {
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter (m): ");
        int m = scanner.nextInt();
        System.out.print("Enter (n): ");
        int n = scanner.nextInt();
        scanner.close();

        int low = 1;
        int high = m;
        int ans = 0;
        while (low <= high) { 
            int mid = low + (high - low) / 2; 
            ans = (int) Math.pow(mid, n);
            if (ans == m) {
                System.out.println("found: " + mid);
                return; 
            } else if (ans < m) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        
        System.out.println("not found");
    }
}
