/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MinhQuan_59131988_StrateryPatternBT2;
import java.util.ArrayList;
/**
 *
 * @author quan
 */
public class Main {
    private static void inDS(ArrayList<HangHoa>dS){
        int tongTien = 0;
        int i;
        for(i = 0; i < dS.size(); i++)
        {
            System.out.println("TenHH "+(i+1)+": "+dS.get(i).getTenHH()+", Gia: "+dS.get(i).getGia()+", MoTa: "+dS.get(i).getMota());
            tongTien = tongTien + dS.get(i).getGia();
        }
        System.out.println("Tong so tien trong gio hang: " + tongTien);
        System.out.println(" ");
    }
    public static void main(String[] args){
        HangHoa hH1 = new HangHoa("Giay the thao", 1500000, "ben, dep");
        HangHoa hH2 = new HangHoa("Giay di choi", 2500000, "dep, sang trong");
        HangHoa hH3 = new HangHoa("Dep", 500000, "thoai mai");
        
        ArrayList <HangHoa> dS1 = new ArrayList<>();
        dS1.add(hH2);
        
        ArrayList <HangHoa> dS2 = new ArrayList<>();
        dS2.add(hH1);
        dS2.add(hH3); 
        
        
        GioHang gH1 = new GioHang();
        gH1.setHinhThucTT(new ThanhToanCOD());       
        inDS(dS1);        
        gH1.setHangHoa(); 
        
        
        GioHang gH2 = new GioHang();
        gH2.setHinhThucTT(new ThanhToanOnline());                     
        inDS(dS2);        
        gH2.setHangHoa();
    }
}
