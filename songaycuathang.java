import java.util.Scanner;

public class songaycuathang {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month = 0;
        int year = 0;

        // Nhập tháng và năm từ người dùng
        while (true) {
            System.out.print("what month (1-12): ");
            month = scanner.nextInt();
            if (month < 1 || month > 12) {
                System.out.println("Tháng không hợp lệ. Vui lòng nhập lại.");
            } else {
                break;
            }
        }
        while (true) {
            System.out.print("of year? ");
            year = scanner.nextInt();
            if (year < 0) {
                System.out.println("Năm không hợp lệ. Vui lòng nhập lại.");
            } else {
                break;
            }
        }

        
        int numberOfDays = 0;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numberOfDays = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numberOfDays = 30;
                break;
            case 2:
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    numberOfDays = 29;
                } else {
                    numberOfDays = 28;
                }
                break;
        }

        // In ra số ngày của tháng
        System.out.println("Thang " + month + " nam " + year + " có " + numberOfDays + " ngày.");
    }
}

