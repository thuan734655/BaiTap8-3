package org.example;

import java.io.File;
import java.util.Scanner;

public class BAi1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập đường dẫn của tệp: ");
        String filePath = scanner.nextLine();

        File file = new File(filePath);

        if (file.exists()) {
            long fileSize = file.length();
            double fileSizeKB = fileSize / 1024.0;
            double fileSizeMB = fileSizeKB / 1024.0;

            System.out.println("Độ lớn của tệp là:");
            if (fileSizeMB > 1) {
                System.out.print(fileSizeMB);
            } else if (fileSizeKB > 1) {
                System.out.print(fileSizeKB);
            } else {
                System.out.print(fileSize);
            }
        } else {
            System.out.println("Tệp không tồn tại.");
        }

    }
}
