/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lthdt.donglenh.chuong1;

import java.util.Date;

/**
 *
 * @author Admin
 */

public class Student extends Person implements TaxInterface {
    private String thanhpho, truonghoc;

    public Student() {
    }

    public Student(String thanhpho, String truonghoc, String hoten, String gioitinh, String diachi, Date ngaysinh, int tuoi) {
        super(hoten, gioitinh, diachi, ngaysinh, tuoi);
        this.thanhpho = thanhpho;
        this.truonghoc = truonghoc;
    }

    public String getThanhpho() {
        return thanhpho;
    }

    public void setThanhpho(String thanhpho) {
        this.thanhpho = thanhpho;
    }

    public String getTruonghoc() {
        return truonghoc;
    }

    public void setTruonghoc(String truonghoc) {
        this.truonghoc = truonghoc;
    }

    @Override
    public double calcX(double income) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
    
    
    
}
