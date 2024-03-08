package org.example;

import java.io.File;
import java.util.Scanner;

public class BAi2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập đường dẫn của thư mục hoặc tệp cần xoá: ");
        String path = scanner.nextLine();

        File fileOrDirectory = new File(path);

        if (fileOrDirectory.exists()) {
            if (fileOrDirectory.isDirectory()) {
                deleteDirectory(fileOrDirectory);
            } else {
                fileOrDirectory.delete();
                System.out.println("Đã xoá tệp " + fileOrDirectory.getName());
            }
            System.out.println("Đã xoá thành công.");
        } else {
            System.out.println("Thư mục hoặc tệp không tồn tại.");
        }

    }
    public static void deleteDirectory(File directory) {
        File[] files = directory.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    deleteDirectory(file);
                } else {
                    file.delete();
                    System.out.println("Đã xoá tệp " + file.getName());
                }
            }
        }
        directory.delete();
        System.out.println("Đã xoá thư mục " + directory.getName());
    }
}
