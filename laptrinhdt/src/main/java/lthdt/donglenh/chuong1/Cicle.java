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
public class Cicle  extends Shape {
    private int r, x, y;

    public Cicle() {
    }

    public Cicle(int r, int x, int y) {
        this.r = r;
        this.x = x;
        this.y = y;
    }
    
    @Override
    public double calC()  {
    double result = 2*Math.PI* this.r;
    return result;
}
    
    @Override
    public double calS() {
    double result = Math.PI*this.r*this.r;
    return result;
}

public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
     @Override
    public String toString() {
        String output = "Chu vi hình tron là: " +calC()+"\n"+
                "Diện tích hình tròn là: "+calS();
       return output;
    }
}
