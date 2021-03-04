/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lthdt.donglenh.chuong1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class xuatnhap {
    

    public static void main(String[] args) {
        boolean a = false;
        int b = 10;
        float c = 2.4f;
        double d = 12.6;
        byte e = 3;
        String q = "hello cac ban";
        char w = 'V';

        Scanner tam = new Scanner(System.in);
        System.out.println("Hãy nhập họ tên của bạn:");
        String ten = tam.nextLine();

        System.out.println("Họ tên của bạn là: " + ten);

        System.out.println("Hãy nhập tuổi của bạn:");
        String tuoi = tam.nextLine();
        b = Integer.parseInt(tuoi);
        System.out.println("Tuổi của bạn là: " + b);

        System.out.println("Hãy nhập 1 con số vào đây:");
        int somayman = tam.nextInt();

        System.out.println("Số may mắn của bạn là: " + somayman);

    }
}

