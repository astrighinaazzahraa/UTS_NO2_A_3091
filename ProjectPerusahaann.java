/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.projectperusahaann;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author User
 */
public class ProjectPerusahaann {
       
public static void main(String[] args) throws IOException {
SalariedEmployee S = new SalariedEmployee();
CommissionEmployee C = new CommissionEmployee();
ProjectPlanner P = new ProjectPlanner();
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));try{
S.nama_3091 = "Astri";
S.nip_3091 = 21103091;
S.upahMingguan_3091 = 1500000;
C.nama_3091 = "Ghina";
C.nip_3091 = 21103008;
C.gajiPokok_3091 = 4000000;
C.komisi_3091 = 1000000;
C.totalPenjualan_3091 = 100;
P.nama_3091 = "Azzahraa";
P.nip_3091 = 21103007;
P.gajiPokok_3091 = 3000000;
P.komisi_3091 = 500000;
P.totalHasilProyek_3091 = 150;
S.cetakSalariedEmployee();
System.out.println("");
C.cetakCommissionEmployee();
System.out.println("");
P.cetakProjectPlanner();
System.out.println("");
}
catch(Exception ex){
System.out.println(ex);
}
}
}
    

