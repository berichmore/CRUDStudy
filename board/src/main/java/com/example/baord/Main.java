package com.example.baord;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("== 자바 게시판 시작==");



        while (true) {
            System.out.println("명령) exit");
            String cmd = sc.nextLine();

//            if (cmd == "exit") {
                // 문자열은 동등비교가 안 됨 equals를 써야 함
            if (cmd.equals("exit")) {

                System.out.println("프로그램을 종료합니다.");
            }

            System.out.println("입력받은 명령어 " + cmd);
            System.out.println("== 자바 게시판 시작==");
        }
    }
}
