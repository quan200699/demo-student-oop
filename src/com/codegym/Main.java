package com.codegym;

import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Nhập số lượng sinh viên");
        int size = sc.nextInt();
        Student[] students = new Student[size];
        //Nhập dữ liệu
        for (int i = 0; i < students.length; i++) {
            sc.nextLine();
            students[i] = inputStudentInfo();
        }
        int choice = -1;
        do {
            menu();
            System.out.println("Nhập lựa chọn của bạn");
            choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    showStudentList(students);
                    break;
                }
            }
        } while (choice != 0);
        //Hiển thị
        showStudentList(students);
    }

    public static void menu() {
        System.out.println("1. Hiển thị danh sách sinh viên");
        System.out.println("2. Thêm 1 sinh viên");
        System.out.println("3. Chỉnh sửa thông tin sinh viên");
        System.out.println("4. Xóa 1 sinh viên");
        System.out.println("5. Tìm sinh viên có điểm cao nhất");
        System.out.println("6. Sắp xếp danh sách sinh viên có điểm cao -> thấp");
        System.out.println("0. Thoát chương trình");
    }

    public static void showStudentList(Student[] students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public static Student inputStudentInfo() {
        System.out.println("Nhập mã sinh viên:");
        String id = sc.nextLine();
        System.out.println("Nhập tên sinh viên:");
        String name = sc.nextLine();
        System.out.println("Nhập ngày sinh:");
        String dateOfBirth = sc.nextLine();
        System.out.println("Nhập điểm:");
        double mark = sc.nextDouble();
        return new Student(id, name, dateOfBirth, mark);
    }
}
