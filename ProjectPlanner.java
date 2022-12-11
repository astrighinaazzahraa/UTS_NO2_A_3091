/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectperusahaann;

/**
 *
 * @author Astri Ghina Azzahraa
 * 21103091
 */
public class ProjectPlanner {

String nama_3091;
int nip_3091;
double gajiPokok_3091;
double komisi_3091;
double totalHasilProyek_3091;
private double GajiProjectPlanner_3091;
private double pajak_3091;

//Method passed by reference dengan parameter tipe data class
public double totalGaji (){
pajak_3091 = (0.05 * gajiPokok_3091);
GajiProjectPlanner_3091 = gajiPokok_3091 + (komisi_3091*totalHasilProyek_3091) -
pajak_3091;
return GajiProjectPlanner_3091;
}
public void cetakProjectPlanner(){
System.out.println(" \n");
System.out.println(" Data Project Planner \n");
System.out.println("Nama :"+nama_3091);
System.out.println("NIP :"+nip_3091);System.out.println("gaji Pokok :"+gajiPokok_3091);
System.out.println("Komisi : "+komisi_3091);
System.out.println("Total Hasil Proyek :"+totalHasilProyek_3091);
}
}
    

