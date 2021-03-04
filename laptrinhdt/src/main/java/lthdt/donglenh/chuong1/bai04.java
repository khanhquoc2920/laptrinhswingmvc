/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lthdt.donglenh.chuong1;

/**
 *
 * @author Admin
 */
public class bai04 {
public static void main(String[] args) {
        Shape hinhtron = new  Cicle (8, 4, 6 );
//        System.out.println("Chu vi hình tròn là: "+hinhtron.calC());
//        System.out.println("Diện tích hình tròn là: "+hinhtron.calS());
 System.out.println(hinhtron.toString());
        Shape hcn = new  Rectangle (8, 4, 6, 2 );
//        System.out.println("Chu vi hình chữ nhật là: "+hcn.calC());
//        System.out.println("Diện tích hình chữ nhật là: "+hcn.calS());
    }
}
