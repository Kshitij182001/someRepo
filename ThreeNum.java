import java.util.Arrays;
import java.util.Scanner;

public class ThreeNum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter next number : ");
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        int sum = arr[0] + arr[arr.length - 1];

        System.out.println("Sum : " + sum);


    }
}