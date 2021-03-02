/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap01;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class StudentController {
    private Student student;
    private ArrayList<Student> students;
    private StudentView view;

    public StudentController() {
    }

    public StudentController(StudentView view) {
        this.view = view;
    }
    

    public StudentController(Student student) {
        this.student = student;
    }
    
//    public void nhap_du_lieu_sinh_vien(StudentView view){
//        this.student = view.them_du_lieu_sinh_vien();
//    }
    
    public void nhap_du_lieu_sinh_vien(){
        this.student = this.view.them_du_lieu_sinh_vien();
    }
    
    public void hien_thi_sinh_vien(){
        this.view.hien_thi_mot_sinh_vien(this.student);
    }
}