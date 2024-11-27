import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
public class Lab5 {
public static void main(String args[])
{
	Problem1();
	Problem2();
	Problem3();
	Problem4();
	Problem5();
	
}
public static void Problem1()
{
	int[] arr = {4, 1, 3, 2, 6, 5};
    arrangeEvenOdd(arr);
    System.out.println("Arranged Array: " + Arrays.toString(arr));
}

public static void arrangeEvenOdd(int[] arr) {
    int left = 0, right = arr.length - 1;

    while (left < right) {
        while (arr[left] % 2 == 0 && left < right)
            left++;
        while (arr[right] % 2 != 0 && left < right)
            right--;

        if (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
public static void Problem2()
{
	 Scanner scanner = new Scanner(System.in);
     int[] arr = new int[100];
     int size = 0;

     System.out.println("Enter up to 100 numbers (-1 to end): ");
     int num;
     while ((num = scanner.nextInt()) != -1 && size < 100) {
         arr[size++] = num;
     }

     if (size > 0) {
         findMinMax(arr, size);
     } else {
         System.out.println("No numbers entered.");
     }
 }

 public static void findMinMax(int[] arr, int size) {
     int min = arr[0];
     int max = arr[0];
     int minIndex = 0;
     int maxIndex = 0;

     for (int i = 1; i < size; i++) {
         if (arr[i] < min) {
             min = arr[i];
             minIndex = i;
         }
         if (arr[i] > max) {
             max = arr[i];
             maxIndex = i;
         }
     }

     System.out.println("Minimum element: " + min + ", Index: " + minIndex);
     System.out.println("Maximum element: " + max + ", Index: " + maxIndex);
}
 public static void Problem3()
 {
	 int[] nums = {1, 2, 3, 4, 5, 6, 7};
     int k = 3;
     rotateArray(nums, k);
     System.out.println("Rotated Array: " + Arrays.toString(nums));
 }

 public static void rotateArray(int[] nums, int k) {
     int n = nums.length;
     k %= n;
     reverse(nums, 0, n - 1);
     reverse(nums, 0, k - 1);
     reverse(nums, k, n - 1);
 }

 public static void reverse(int[] nums, int start, int end) {
     while (start < end) {
         int temp = nums[start];
         nums[start] = nums[end];
         nums[end] = temp;
         start++;
         end--;
     }
 }
 public static void Problem4()
 {
	 int[] arr = {5, 10, 2, 5, 50, 5, 10, 1, 2, 2};
     findFrequency(arr);
 }

 public static void findFrequency(int[] arr) {
     Map<Integer, Integer> frequencyMap = new HashMap<>();

     for (int num : arr) {
         frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
     }

     for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
         System.out.println("Frequency of " + entry.getKey() + " = " + entry.getValue());
     }
 }
 public static void Problem5()
 {
	  Scanner scanner = new Scanner(System.in);
      int[] numbers = new int[10];

      System.out.println("Enter 10 numbers:");
      for (int i = 0; i < 10; i++) {
          numbers[i] = scanner.nextInt();
      }

      reverseArray(numbers);

      System.out.println("Reversed numbers:");
      for (int num : numbers) {
          System.out.print(num + " ");
      }
  }

  public static void reverseArray(int[] arr) {
      int left = 0;
      int right = arr.length - 1;
      while (left < right) {
          int temp = arr[left];
          arr[left] = arr[right];
          arr[right] = temp;
          left++;
          right--;
      }
 }
}
