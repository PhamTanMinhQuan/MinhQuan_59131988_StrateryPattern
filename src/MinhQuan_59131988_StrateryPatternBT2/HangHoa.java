/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MinhQuan_59131988_StrateryPatternBT2;

/**
 *
 * @author quan
 */
public class HangHoa {
    private final String tenHH;
    private final int gia;
    private final String moTa;
    
       
    public String getTenHH(){
        return tenHH;
    }
    public int getGia(){
        return gia;
    }
    public String getMota(){
        return moTa;
    }
    
    public HangHoa(String tenHH, int gia, String moTa){
        this.tenHH = tenHH;
        this.gia = gia;
        this.moTa = moTa;
    
    }
           
}
