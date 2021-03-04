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
public class Worker extends Person{
    private int luong;
    private String congty;

    public Worker() {
    }

    public Worker(int luong, String congty, String hoten, String gioitinh, String diachi, Date ngaysinh, int tuoi) {
        super(hoten, gioitinh, diachi, ngaysinh, tuoi);
        this.luong = luong;
        this.congty = congty;
    }

    public int getLuong() {
        return luong;
    }

    public void setLuong(int luong) {
        this.luong = luong;
    }

    public String getCongty() {
        return congty;
    }

    public void setCongty(String congty) {
        this.congty = congty;
    }

   
    
}