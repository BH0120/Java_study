package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerFileDemo {
    public static void main(String[] args) {

        //try~catch: 예외 처리
        try{
            //src파일 밖에 있는 out.txt파일을 읽어온 file 객체
            File file = new File("out.txt");
            //System.in이 아닌 file을 읽어올 수 있게 함.
            Scanner sc = new Scanner(file);
            while (sc.hasNextInt()) {
                System.out.println(sc.nextInt()*1000);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
