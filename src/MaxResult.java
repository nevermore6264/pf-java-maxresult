import java.util.Scanner;

public class MaxResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int index = 0;
        int i;
        //Nhập số lượng phần tử mảng 1
        System.out.println("Mời bạn nhập số lượng phần tử mảng");
        int n = scanner.nextInt();
        int arr[] = new int[n];

        //Nhập phần tử mảng 1
        for (i = 0; i < n; i++) {
            System.out.println("Mời bạn nhập phần tử: " + i);
            arr[i] = scanner.nextInt();
        }
        int max = arr[0];
        for (i = 1; i < arr.length; i++) {
            if (arr[i] >= max) {
                max = arr[i];
            }
        }
        System.out.println("Giá trị lớn nhất của mảng là: " + max);
    }
}