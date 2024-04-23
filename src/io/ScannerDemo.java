package io;

import java.util.Scanner;

/* 스캐너 객체의 첫 사용*/
//public class ScannerDemo {
//    public static void main(String[] args) {
//
//        //System.in: 사용자가 입력한 값
//        //new Scanner 객체를 새로 만듦
//        //new Scanner(System.in): 사용자가 입력한 값을 받는 Scanner 객체
//        Scanner sc = new Scanner(System.in);
//
//        //콘솔창에서 int 입력을 대기하고
//        //int입력이 들어오면 int i 에 그 값을 할당.
//        int i = sc.nextInt();
//        System.out.println(i*1000);
//
//        //Scanner 객체의 종료
//        sc.close();
//    }
//}

/* 스캐너 객체 2번째 사용(반복문) */
public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        * sc.hasNextInt(): 엔터를 입력시 반복문을 실행
        * 만약 입력된 값이 Int라면 true를 반환하고
        * Int가 아니라면, false를 반환하며, while문의 반복이 종료
        */
        while (sc.hasNextInt()) {
            System.out.println(sc.nextInt()*1000);
        }
        sc.close();
    }
}