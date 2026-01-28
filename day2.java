
//arr[4] = -3 2 4 -1

// arr = -7 1 5 2 -4 3  0
// left sum right sum
// 3 -1 2 -1 1 2 1 
public class day2 {

    public static void main(String[] args) {
        int[] arr = {-3, -1, 2, -1, 1, 2, 1};
        int n = arr.length;

        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }

        int leftSum = 0;

        for (int i = 0; i < n; i++) {
            int rightSum = totalSum - leftSum - arr[i];

            if (leftSum == rightSum) {
                System.out.println("Equilibrium index is: " + i);
                return;
            }

            leftSum += arr[i];
        }

        System.out.println("No equilibrium index found");
    }
}
