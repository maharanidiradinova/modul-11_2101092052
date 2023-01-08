/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Maharani2101092052_modul11;

/**
 *
 * @author Maharani Diradinova
 */
public class StudentRecordExample {
    public static void main(String[] args) {
        StudentRecord annarecord = new StudentRecord();
        StudentRecord alirecord = new StudentRecord();
        
        
        annarecord.setName("Ani");
        annarecord.setAddress("Padang");
        annarecord.setAge(18);
        annarecord.setMathGrade(90);
        annarecord.setEnglishGrade(80);
        annarecord.setScienceGrade(90);
        
        alirecord.setName("Ali");
        alirecord.setAddress("Bukittinggi");
        alirecord.setAge(18);
        
        System.out.println("Nama            : "+annarecord.getName());
        System.out.println("Alamat          : "+annarecord.getAddress());
        System.out.println("Umur            : "+annarecord.getAge());
        System.out.println("Matematika      : "+annarecord.getMathGrade());
        System.out.println("B.inggris       : "+annarecord.getEnglishGrade());
        System.out.println("Pengetahuan     : "+annarecord.getScienceGrade());
        System.out.println("Rata - Rata     : "+annarecord.getAverage());
        
        System.out.println("\n");
        alirecord.print("");
        alirecord.print(90,80,70);
        
        //jumlah siswa
        System.out.println("\nJumlah Siswa    : "+annarecord.getStudentCount());
        
        
        
        
    }
    
}