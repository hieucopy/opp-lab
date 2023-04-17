import java.util.Arrays;

public class Summatrix {

    public static void main(String[] args) {
        int[] arr = { 9, 3, 7, 1, 8, 2, 6, 4, 5 };
        
        
        Arrays.sort(arr);
        System.out.println("Mảng sau khi sắp xếp: " + Arrays.toString(arr));
        
        
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Tổng các phần tử trong mảng: " + sum);
        
        
        double avg = (double) sum / arr.length;
        System.out.println("Giá trị trung bình của các phần tử trong mảng: " + avg);
    }
}