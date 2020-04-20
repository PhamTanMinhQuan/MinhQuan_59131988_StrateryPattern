/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MinhQuan_59131988_StrateryPatternBT3;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
/**
 *
 * @author quan
 */
public class Main {
    public static void main(String[] args) throws Exception{
        SoSanhTheoDiem soSanhTheoDiem =new SoSanhTheoDiem();
        SoSanhTheoTen soSanhTheoTen=new SoSanhTheoTen();
        DateFormat dateFmat=new SimpleDateFormat("MM/dd/yyyy");
        ArrayList<SinhVien> sv=new ArrayList<>();
        SinhVien sv1=new SinhVien("Pham Tan Minh Quan",dateFmat.parse("1/16/1999"),7.2f);
        SinhVien sv2=new SinhVien("Nguyen Van A",dateFmat.parse("4/20/1999"),8.5f);
        SinhVien sv3=new SinhVien("Tran Van B",dateFmat.parse("2/28/1999"),6.9f);
        SinhVien sv4=new SinhVien("Ho Thi C",dateFmat.parse("12/9/1999"),5.1f);
        
        sv.add(sv1);
        sv.add(sv2);
        sv.add(sv3);
        sv.add(sv4);
        QLSV qlsv=new QLSV();
        qlsv.setDsSV(sv);
        qlsv.setISoSanh(soSanhTheoTen);
        qlsv.sapXep();
        System.out.println("Danh sach sap xep theo ten: ");
        qlsv.inDS();
        
        qlsv.setISoSanh(soSanhTheoDiem);
        qlsv.sapXep();
        System.out.println("Danh sach sap xep theo diem: ");
        qlsv.inDS();
    }
}
